package cn.benevolence.doctor.service;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;

/**
 * @author xianshan
 * @create 2020-03 15:43
 */
public interface CallService {
    EData getMyTriageList(PageBean pageBean, String name);

    EData update(Integer curpatientid);

    Integer getWaitingNumByStatus(Integer status);

    EData getCurAndNextPatient(Integer curpatientid, Integer nextpatientid, Integer status);
}
