package cn.benevolence.sys.service.Impl;

import cn.benevolence.model.EData;
import cn.benevolence.model.PageBean;
import cn.benevolence.sys.domapper.LogDoMapper;
import cn.benevolence.sys.mapper.LogMapper;
import cn.benevolence.sys.model.Log;
import cn.benevolence.sys.model.LogExample;
import cn.benevolence.sys.service.LogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author 小马
 * @create 2020-02-19 11:56
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;
    @Autowired
    private LogDoMapper logDoMapper;
    @Override
    public EData list(PageBean pageBean, String name) {
//        LogExample example = new LogExample();
//        LogExample.Criteria criteria = example.createCriteria().andUsernameIsNotNull();
//        if(!StringUtils.isEmpty(name.toUpperCase())){
//            criteria.andUsernameLike("%"+name+"%");
//        }
        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        PageInfo<Log> info = new PageInfo<>(logDoMapper.all());
        return EData.setData(info.getTotal(),info.getList());
    }
}
