package cn.benevolence.exception;

import cn.benevolence.model.R;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 小马
 * @create 2020-02-08 16:37
 */
@RestControllerAdvice
@Slf4j
public class ExceptionHandle {


//    异常处理
    @ExceptionHandler(AuthorizationException.class)
    public R authorizationException(AuthorizationException e){
        return R.error("权限不足");
    }


    @ExceptionHandler(IncorrectCredentialsException.class)
    public R IncorrectCredentialsException(IncorrectCredentialsException e){
        return R.error("账号或密码不正确");
    }
    @ExceptionHandler(AuthenticationException.class)
    public R AuthenticationException(AuthenticationException e){
        return R.error("账户验证失败");
    }

    @ExceptionHandler(UnknownAccountException.class)
    public R UnknownAccountException(UnknownAccountException e){
        return R.error(e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public R Exception(Exception e){
        log.error(e.getMessage());
        return R.error("系统错！误请与管理员联系");
    }

}
