package cn.benevolence.doctor.service.impl;

import cn.benevolence.doctor.doMapper.DoctorDoMapper;
import cn.benevolence.doctor.mapper.DeptMapper;
import cn.benevolence.doctor.mapper.DoctorMapper;
import cn.benevolence.doctor.model.Dept;
import cn.benevolence.doctor.model.DeptExample;
import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.doctor.model.DoctorExample;
import cn.benevolence.doctor.service.DoctorService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author JYSH
 * @create 2020-02-17-19:51
 */
@Service
public class DoctorServiceImpl implements DoctorService {
        @Autowired
        private DoctorMapper doctorMapper;

        @Override
        public EData list(PageBean pageBean, String name) {
          DoctorExample doctorExample = new DoctorExample();
 DoctorExample.Criteria criteria = doctorExample.createCriteria().andIsdelEqualTo(false);  //Doctor表的查询条件：所有isdel=0的数据
        //分页
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<Doctor> info = new PageInfo<>(doctorMapper.selectByExample(doctorExample));
        return EData.setData( info.getTotal(),info.getList() );
        }

    @Override
    public R save(Doctor doctor) {
        try {
            if (doctor.getDid()!=null){
                doctorMapper.updateByPrimaryKeySelective(doctor);
            }else {
                doctor.setDname(doctor.getDname());
                doctorMapper.insertSelective(doctor);
            }
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error("error");
        }
    }

        @Override
        public R del(Integer did) {
            try {
                if (did!=null){
                    Doctor doctor = new Doctor();
                    doctor.setDid(did);
                    doctor.setIsdel(true);
                    doctorMapper.updateByPrimaryKeySelective(doctor);
                }
                    return R.ok();
            }catch (Exception e){
                    e.printStackTrace();
                    return R.error("操作失败");
            }
        }



    @Autowired
    private DeptMapper deptMapper;

        @Autowired
        private DoctorDoMapper doctorDoMapper;
    @Override
    public EData deptList(PageBean pageBean,String name) {

        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<Doctor> info = new PageInfo<>(doctorDoMapper.list());
        return EData.setData(info.getTotal(),info.getList());
    }

    @Override
    public R saveDept(Dept dept) {
        if(dept.getId()!=null){
            deptMapper.updateByPrimaryKeySelective(dept);
        }else {
            deptMapper.insertSelective(dept);
        }
        return R.ok();
    }

    @Override
    public EData dept(PageBean pageBean, String name) {
        DeptExample example = new DeptExample();
        DeptExample.Criteria criteria = example.createCriteria()
                .andIsdelEqualTo(false);
        if(!StringUtils.isEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<Dept> info = new PageInfo<>(deptMapper.selectByExample(example));
        return EData.setData(info.getTotal(),info.getList());
    }

    @Override
    public R deptDel(Integer id) {
        if(id!=null){
            Dept dept = new Dept();
            dept.setId(id);
            dept.setIsdel(true);
            deptMapper.updateByPrimaryKeySelective(dept);
        }
        return R.ok();
    }
}
