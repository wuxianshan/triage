package cn.benevolence.sys.service.Impl;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.sys.mapper.RoleMapper;
import cn.benevolence.sys.model.Role;
import cn.benevolence.sys.model.RoleExample;
import cn.benevolence.sys.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author 小马
 * @create 2020-02-13 15:29
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;

    @Override
    public EData list(PageBean pageBean, String name) {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria()
                .andIsdelEqualTo(0);
        if(!StringUtils.isEmpty(name)){
            criteria.andCnameEqualTo("%"+name+"%");
        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<Role> info = new PageInfo<>(roleMapper.selectByExample(example));
        System.out.println(info.getTotal()+"===="+info.getList());
        return EData.setData(info.getTotal(),info.getList());
    }

    @Override
    public R save(Role role) {
        try {
            if (role.getId()!=null){
                roleMapper.updateByPrimaryKeySelective(role);
            }else {
                roleMapper.insertSelective(role);
            }
            return R.ok("success");
        }catch (Exception e){
            return R.error("error!");
        }

    }

    @Override
    public EData getAll() {
        RoleExample example=new RoleExample();
        RoleExample.Criteria criteria=example.createCriteria()
                .andIsdelEqualTo(0);
        return EData.setData(1L,roleMapper.selectByExample(example));
    }

    @Override
    public R del(Integer id) {
        Role role=new Role();
        role.setId(id);
        role.setIsdel(1);
        roleMapper.updateByPrimaryKeySelective(role);
        return R.ok();
    }


}
