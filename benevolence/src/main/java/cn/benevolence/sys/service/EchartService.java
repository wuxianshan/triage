package cn.benevolence.sys.service;

import cn.benevolence.sys.model.Echart;

import java.util.List;

/**
 * @author 小马
 * @create 2020-02-22 11:44
 */
public interface EchartService {
   List<Echart> dept();

   List<Echart> patient();

   List hospatoal();

   List<Echart> deptNumber();
//查询每天的新增用户
   List<Echart> users();

}
