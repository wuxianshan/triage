package cn.benevolence.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 小马
 * @create 2020-03-05 17:43
 */
@Component
@EnableAsync
public class TaskScheduled {

   /* @Autowired
    private CallController callController;

    @Scheduled(fixedDelay = 10000) //每10秒执行一次
    public  void scheduledTaskByFixedDelay() {
        System.out.println("定时任务开始 ByFixedDelay：" );
    }*/
}
