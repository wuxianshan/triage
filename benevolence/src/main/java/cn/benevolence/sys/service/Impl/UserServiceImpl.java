package cn.benevolence.sys.service.Impl;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.sys.domapper.RoleDoMapper;
import cn.benevolence.sys.domapper.UserDoMapper;
import cn.benevolence.sys.mapper.RoleMapper;
import cn.benevolence.sys.mapper.UserMapper;
import cn.benevolence.sys.model.User;
import cn.benevolence.sys.model.UserExample;
import cn.benevolence.sys.service.UserService;
import cn.benevolence.utils.Constants;
import cn.benevolence.utils.ShiroUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-19 21:03
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDoMapper userDoMapper;


    @Override
    public R modifyPassword(String newPassword, String oldPassword) {
        User user = ShiroUtils.getUser(); //session中获取用户
        String oldpassword=ShiroUtils.sha256(oldPassword,user.getCname());
        String newpassword=ShiroUtils.sha256(newPassword,user.getCname());
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(user.getId())
                .andPasswordEqualTo(oldpassword);
        List<User> users = userMapper.selectByExample(example);
        if(users.size()>0){
            user.setPassword(newpassword);
            userMapper.updateByPrimaryKeySelective(user);
            return R.ok();
        }
        return R.error("旧密码错误");
    }

    @Override
    public EData list(PageBean pageBean, String name) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria()
                .andIsdelEqualTo(false);
//        example.createCriteria().andIsdelEqualTo(false);
        if (!StringUtils.isEmpty(name)){
            criteria.andCnameLike("%"+name+"%");
        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<User> info= new PageInfo<>(userMapper.selectByExample(example));
        return EData.setData(info.getTotal(),info.getList());
    }



    @Override
    @Transactional
    public R save(User user) {
        try {
            if (user.getId()!=null){
                userMapper.updateByPrimaryKeySelective(user);
            }else {
                user.setCname(user.getCname().toUpperCase());
                user.setPassword(ShiroUtils.sha256(Constants.DEFAULTPASSWORD,user.getCname()));
                userMapper.insertSelective(user);
//                Integer id = userDoMapper.userId(user.getCname());
                roleDoMapper.insertUserRole(userDoMapper.userId(user.getCname()),"10");
            }
            return R.ok("success");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("error!");
        }
    }

    @Override
    public R del(Integer id) {
        User user=new User();
        user.setId(id);
        user.setIsdel(true);
        userMapper.updateByPrimaryKeySelective(user);
        return R.ok();
    }

    @Autowired
    private RoleDoMapper roleDoMapper;
    @Override
    @Transactional
    public R saveRoleSet(String roleIds, String roleNames, Integer userId) {
        UserExample example=new UserExample();
        example.createCriteria().andIsdelEqualTo(false)
                .andIdEqualTo(userId);
        if(userId==null||userMapper.selectByExample(example).size()<1){
            return R.error("用户不存在！");
        }
        User user=new User();
        user.setId(userId);
        user.setRoles(roleNames);
        userMapper.updateByPrimaryKeySelective(user);
        if (!StringUtils.isEmpty(roleIds)){
            roleDoMapper.deleteByUser(userId);
            roleDoMapper.insertUserRole(userId,roleIds);
        }
        return R.ok();
    }

}
