package cn.benevolence.history.service.Impl;

import cn.benevolence.history.domapper.HistoryDoMapper;
import cn.benevolence.history.mapper.HistoryMapper;
import cn.benevolence.history.model.History;
import cn.benevolence.history.model.HistoryExample;
import cn.benevolence.history.service.HistoryService;
import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.patient.mapper.PatientMapper;
import cn.benevolence.patient.model.Patient;
import cn.benevolence.patient.model.PatientExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author 小马
 * @create 2020-02-15 14:53
 */
@Service
public class HistoryServiceImpl implements HistoryService {


    @Resource
    private PatientMapper patientMapper;

    @Override
    public EData list(PageBean pageBean,String name) {
        PatientExample example = new PatientExample();
        PatientExample.Criteria criteria = example.createCriteria()
                .andIsdelEqualTo(0);
        if(!StringUtils.isEmpty(name)){
            criteria.andPnameLike("%"+name+"%");
        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());//分页
        PageInfo<Patient> info = new PageInfo<>(patientMapper.selectByExample(example));
        return EData.setData(info.getTotal(),info.getList());
    }

    @Override
    public R del(Integer id) {
        if(id!=null){
           History history = new History();
           history.setId(id);
           history.setIsdel(1);
           historyMapper.updateByPrimaryKeySelective(history);
        }
        return R.ok();
    }

    @Override
    public R save(Patient patient) {
        try {
            if(patient.getPid()!=null){
                patientMapper.updateByPrimaryKeySelective(patient);
            }else {
                patientMapper.insertSelective(patient);
            }   return R.ok();
        } catch (Exception e){
            return R.error("保存失败");
        }

    }

    @Autowired
    private HistoryDoMapper historyDoMapper;

    @Autowired
    private HistoryMapper historyMapper;
    @Override
    public EData likeList(PageBean pageBean,String pname) {

        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<Patient> info = new PageInfo<>(historyDoMapper.likeList(pname));
        return EData.setData(info.getTotal(),info.getList());
    }

    @Override
    public EData all(PageBean pageBean,String name) {
        HistoryExample example = new HistoryExample();
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<History> info = new PageInfo<>(historyDoMapper.all());
        return EData.setData(info.getTotal(),info.getList());
    }

    @Override
    @Transactional
    public R saveIn(Integer id,String pid, String hdiagnose, String hsymptom, String hprescription) {

        String s = historyDoMapper.patientId(pid);
        String patientId="";
       if(!StringUtils.isEmpty(s)){
           patientId=s;
       }else {
           return R.error("不存在该患者");
       }
        if(id!=null) {
            History history = new History();
            history.setId(id);
            history.setPid(patientId);
            history.setHdiagnose(hdiagnose);
            history.setHprescription(hprescription);
            history.setHsymptom(hsymptom);
            historyMapper.updateByPrimaryKeySelective(history);
        }else {
            System.out.println("patient=>>>>>>>>" + patientId);
            historyDoMapper.save(patientId, hdiagnose, hsymptom, hprescription);
            Integer doctorid = historyDoMapper.doctorid(patientId);
            historyDoMapper.updid(doctorid.toString(),patientId);
        }
        return R.ok();
    }

    @Override
    public List<Patient> patientId(String pid) {
        return null;
    }

    @Override
    public EData like(PageBean pageBean,String pname) {
      PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
      PageInfo<History> info = new PageInfo<>(historyDoMapper.like(pname));
       return EData.setData(info.getTotal(),info.getList());
    }


}
