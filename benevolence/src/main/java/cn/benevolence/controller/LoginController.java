package cn.benevolence.controller;

import cn.benevolence.model.R;
import cn.benevolence.sys.service.UserService;
import cn.benevolence.utils.Constants;
import cn.benevolence.utils.ShiroUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SimpleSession;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.Name;
import javax.servlet.http.HttpSession;

/**
 * @author xianshan
 * @create 2020-02 16:18
 */
@Controller
public class LoginController {


    @Autowired
    private UserService userService;

    @GetMapping({"/login","/"})
    public String login(){
        return "login";
    }

    @PostMapping("/modifyPassword")
    @ResponseBody
    public R modifyPassword(String newPassword, String oldPassword){
        return userService.modifyPassword(newPassword,oldPassword);
    }


    @PostMapping("name")
    @ResponseBody
    public Object name(HttpSession session){
      session.setAttribute("name",session.getAttribute("name"));
        System.out.println(session.getAttribute("name"));
        return "main";
    }

    @PostMapping("login")
    @ResponseBody
    public R login(String userName, String password, String imageCode,HttpSession session){
        session.setAttribute("name",userName);
//        System.out.println(session.getAttribute("name")+">>>>>>>>>>>name");
        String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);//Constants:常量：从session中获取生成的验证码
        if(!imageCode.equalsIgnoreCase(kaptcha)){
            return R.error("验证码不正确");
        }
        try{
            Subject subject = ShiroUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
            subject.login(token);
        }catch (UnknownAccountException e) {
            return R.error(e.getMessage());
        }catch (IncorrectCredentialsException e) {
            return R.error("账号或密码不正确");
        }catch (AuthenticationException e) {
            return R.error("账户验证失败");
        }
        return R.ok();
    }
    /**
     * 退出
     */
    @GetMapping("logout")
    public String logout(HttpSession session) {
        ShiroUtils.logout();
        return "redirect:login";
    }
}
