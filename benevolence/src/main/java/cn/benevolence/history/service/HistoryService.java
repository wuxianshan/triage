package cn.benevolence.history.service;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.patient.model.Patient;

import java.util.List;


/**
 * @author 小马
 * @create 2020-02-15 14:52
 */
public interface HistoryService {
//    显示所有患者症状
    EData list(PageBean pageBean,String name);
//      删除病历
    R del(Integer id);
//      添加以及修改病历
    R save(Patient patient);

    EData likeList(PageBean pageBean,String pname);

    EData all(PageBean pageBean,String name);

    R saveIn(Integer id,String pid,String hdiagnose, String hsymptom,String hprescription);

    List<Patient> patientId(String pid);

    EData like(PageBean pageBean,String pname);
}
