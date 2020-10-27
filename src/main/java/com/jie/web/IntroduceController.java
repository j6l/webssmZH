package com.jie.web;

import cn.hutool.core.util.IdUtil;
import com.jie.dto.State;
import com.jie.entity.Huati;
import com.jie.entity.Introduce;
import com.jie.service.iml.InsServiceiml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/21
 * WWW https://github.com/j6l
 */
@RestController
@CrossOrigin
public class IntroduceController {

    @Autowired
    private InsServiceiml intservice;


    @GetMapping(value = "/ilist")
    public State ilist() {
        List<Introduce> introlist = intservice.getIntroduces();
        introlist.forEach( System.out::println );
        return new State( "200", introlist );
    }


    @PostMapping(value = "/iadd")
    public State addhauti(@RequestBody Introduce introduce) {
        if (introduce == null) {
            return new State( "444", "无效数据,添加失败" );
        }
        long h = intservice.insertIntroduce( introduce );
        if (h > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,添加失败" );
    }

    @GetMapping(value = "/idel/{uuid}")
    public State deletehauti(@PathVariable("uuid") String uuid) {
        if (uuid.isEmpty()) {
            return new State( "444", "无效数据,删除失败" );
        }
        long h = intservice.deleteIntroduce( uuid );
        if (h > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,删除失败" );
    }
}
