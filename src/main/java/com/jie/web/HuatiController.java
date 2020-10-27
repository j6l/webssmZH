package com.jie.web;

import cn.hutool.core.util.IdUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.jie.dto.State;
import com.jie.entity.Huati;
import com.jie.entity.Wenti;
import com.jie.service.iml.HuatiServiceiml;
import com.jie.service.iml.WentiServiceiml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
@RestController
@CrossOrigin
public class HuatiController {

    private static final Log log = LogFactory.get();

    @Autowired
    private HuatiServiceiml huatiService;
    @Autowired
    private WentiServiceiml wentiService;


    @GetMapping(value = "/hlist")
    public State gethuatiall() {
        List<Huati> huatis = huatiService.getallHuatis();
        return new State( "200", huatis );
    }


    @GetMapping(value = "/hid/{uuid}")
    public State gethuatiwentiList(@PathVariable("uuid") String uuid) {
        List<Wenti> wentis = wentiService.getallhuatiid( uuid );
        return new State( "200", wentis );
    }

    @PostMapping(value = "/hadd")
    public State addhauti(@RequestBody Huati huati) {
        log.info( "添加了话题 " + huati.getWid() );
        if (huati == null) {
            return new State( "444", "无效数据,添加失败" );
        }
        huati.setUuid( IdUtil.objectId() );
        long h = huatiService.insertHuati( huati );
        if (h > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,添加失败" );
    }

    @GetMapping(value = "/hdel/{uuid}")
    public State deletehauti(@PathVariable("uuid") String uuid) {
        if (uuid.isEmpty()) {
            return new State( "444", "无效数据,删除失败" );
        }
        long h = huatiService.deleteHuati( uuid );
        if (h > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,删除失败" );
    }

    @PostMapping(value = "/hupdate")
    public State updatehauti(@RequestBody Huati huati) {
        if (huati == null) {
            return new State( "444", "无效数据,修改失败" );
        }
        long h = huatiService.updateHuati( huati );
        if (h > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,修改失败" );
    }
}
