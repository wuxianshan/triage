package cn.benevolence.patient.service;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.model.R;
import cn.benevolence.patient.model.Patient;

/**
 * @author 小马
 * @create 2020-02-16 15:39
 */
public interface PatientService {

    EData list(PageBean pageBean, String name);

    R upMoney(Integer pmonry,String pphone);

    R save(Patient patient);

    R del(Integer pid);
}
