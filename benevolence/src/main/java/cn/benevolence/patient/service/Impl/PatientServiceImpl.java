package cn.benevolence.patient.service.Impl;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.patient.domapper.PatientDoMapper;
import cn.benevolence.patient.mapper.PatientMapper;
import cn.benevolence.patient.model.Patient;
import cn.benevolence.patient.model.PatientExample;
import cn.benevolence.patient.service.PatientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author 小马
 * @create 2020-02-16 15:40
 */
@Service
public class PatientServiceImpl implements PatientService {
    @Resource
    private PatientMapper patientMapper;
    @Resource
    private PatientDoMapper patientDoMapper;

    @Override
    public EData list(PageBean pageBean, String name) {
        PatientExample example = new PatientExample();
        PatientExample.Criteria criteria = example.createCriteria()
                .andIsdelEqualTo(0);
        if(!StringUtils.isEmpty(name)){
            criteria.andPnameLike("%"+name+"%");
        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<Patient> info = new PageInfo<>(patientMapper.selectByExample(example));
        return EData.setData(info.getTotal(),info.getList());
    }

    @Override
    public R upMoney(Integer pmonry, String pphone) {
        if(pphone!=null){
            patientDoMapper.upMoney(pmonry,pphone);
        }
        return R.ok();
    }

    @Override
    public R save(Patient patient) {
        if(patient.getPid()!=null){
            patientMapper.updateByPrimaryKeySelective(patient);
        }else {
            patientMapper.insertSelective(patient);
        }
        return R.ok();
    }

    @Override
    public R del(Integer pid) {
        if(pid!=null){
            Patient patient = new Patient();
            patient.setPid(pid);
            patient.setIsdel(1);
            patientMapper.updateByPrimaryKeySelective(patient);
        }
        return R.ok();
    }
}
