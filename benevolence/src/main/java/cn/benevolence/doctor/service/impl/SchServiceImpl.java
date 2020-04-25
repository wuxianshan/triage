package cn.benevolence.doctor.service.impl;

import cn.benevolence.doctor.doMapper.ScheduleDoMapper;
import cn.benevolence.doctor.domodel.MySchedule;
import cn.benevolence.doctor.mapper.DoctorMapper;
import cn.benevolence.doctor.mapper.SchedulingMapper;
import cn.benevolence.doctor.model.*;
import cn.benevolence.doctor.service.SchService;
import cn.benevolence.make.domodel.MySchedule1;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-26 17:35
 */
@Service
public class SchServiceImpl implements SchService {
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private SchedulingMapper schedulingMapper;

    @Override
    public List<Doctor> list() {
        DoctorExample example = new DoctorExample();
        example.createCriteria().andIsdelEqualTo(false);
        PageInfo<Doctor> info = new PageInfo<>(doctorMapper.selectByExample(example));
        return info.getList();
    }

    @Override
    public List<Scheduling> workList() {
        SchedulingExample example = new SchedulingExample();
        example.createCriteria().andBackgroundcolorIsNotNull();
        PageInfo<Scheduling> info = new PageInfo<>(schedulingMapper.selectByExample(example));
        return info.getList()   ;
    }

    @Autowired
    private ScheduleDoMapper scheduleDoMapper;
    @Override
    public String getDeptName(Integer id) {
        String deptName = scheduleDoMapper.getDeptName(id);
        return deptName;
    }

    @Override
    public R save(Scheduling scheduling) {
        if(scheduling.getId()!=null){
            schedulingMapper.updateByPrimaryKeySelective(scheduling);
        }else{
            schedulingMapper.insertSelective(scheduling);
        }
        return R.ok();
    }

    @Override
    public List<MySchedule> evens() {
        return scheduleDoMapper.even();
    }

    @Override
    public EData doclist(PageBean pageBean, Integer deptid, String position) {
        //分页
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<MySchedule1> info = new PageInfo<>(scheduleDoMapper.doclist(deptid,position));
        return EData.setData( info.getTotal(),info.getList() );
    }

    @Override
    public R del(Integer id) {
        if(id!=null){
            schedulingMapper.deleteByPrimaryKey(id);
        }
        return R.ok();
    }

    @Override
    public R upWork(Scheduling scheduling) {
        if(scheduling.getId()!=null){
            schedulingMapper.updateByPrimaryKeySelective(scheduling);
        }
        return R.ok();
    }

}
