package cn.benevolence.doctor.service.impl;

import cn.benevolence.doctor.doMapper.DeptDoMapper;
import cn.benevolence.doctor.mapper.DeptMapper;
import cn.benevolence.doctor.model.Dept;
import cn.benevolence.doctor.model.DeptExample;
import cn.benevolence.doctor.service.DeptService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author xianshan
 * @create 2020-02 11:26
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public EData list(PageBean pageBean, String name) {
        DeptExample deptExample = new DeptExample();
        DeptExample.Criteria criteria = deptExample.createCriteria().andIsdelEqualTo(false)
                .andIsstopEqualTo(false);
        if (!StringUtils.isEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<Dept> info = new PageInfo<>(deptMapper.selectByExample(deptExample));
        EData e = EData.setData(info.getTotal(),info.getList());
        System.out.println(e.getRows().toString());
        return EData.setData(info.getTotal(),info.getList());
    }


    @Override
    public R save(Dept dept) {
        try {
            if (dept.getId()!=null){
                deptMapper.updateByPrimaryKeySelective(dept);
            }else {
                deptMapper.insertSelective(dept);
            }
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error("error");
        }
    }

    @Override
    public R delete(Integer id) {
        try {
            if (id!=null){
                Dept dept = new Dept();
                dept.setId(id);
                dept.setIsdel(true);
                deptMapper.updateByPrimaryKeySelective(dept);
            }
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error("操作失败");
        }
    }

    @Autowired
    private DeptDoMapper deptDoMapper;

    @Override
    public R deleteAll(String ids) {
        deptDoMapper.deleteAllByIds(ids);
        return R.ok();
    }
}
