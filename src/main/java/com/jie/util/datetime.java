package com.jie.util;

import cn.hutool.core.date.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
@Component
public class datetime {

    public String getsettime(String s) {
        Date date = DateUtil.parse( s );
        String time = DateUtil.formatDateTime( date );
        return time;
    }

    @Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次
    public void myTest(){
        System.out.println("进入测试");
    }
}
