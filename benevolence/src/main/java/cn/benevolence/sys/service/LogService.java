package cn.benevolence.sys.service;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;

/**
 * @author 小马
 * @create 2020-02-19 11:56
 */
public interface LogService {

    EData list(PageBean pageBean, String name);
}
