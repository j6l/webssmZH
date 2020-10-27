package com.jie.web;

import cn.hutool.core.util.IdUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.jie.dto.State;
import com.jie.entity.Huati;
import com.jie.entity.User;
import com.jie.entity.Wenti;
import com.jie.service.iml.HuatiServiceiml;
import com.jie.service.iml.UserServiceiml;
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
public class WentiController {

    private static final Log log = LogFactory.get();

    @Autowired
    private HuatiServiceiml huatiService;
    @Autowired
    private WentiServiceiml wentiService;
    @Autowired
    private UserServiceiml userService;


    @GetMapping(value = "/wlist")
    public State getwentiList() {
        List<Wenti> wentis = wentiService.getallWentis();
        for (Wenti w : wentis) {
            User user = null;
            try {
                user = userService.getUser( w.getUserid() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (user == null) {
                w.setUserid( "用户已删除!" );
            } else {
                w.setUserid( user.getName() );
            }

        }
        return new State( "200", wentis );
    }

    @GetMapping(value = "/whtlist/{uuid}")
    public State getwentHTiList(@PathVariable("uuid") String uuid) {
        List<Wenti> wentis = wentiService.getallhuatiid(uuid);
        for (Wenti w : wentis) {
            User user = null;
            try {
                user = userService.getUser( w.getUserid() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (user == null) {
                w.setUserid( "用户已删除!" );
            } else {
                w.setUserid( user.getName() );
            }

        }
        return new State( "200", wentis );
    }

    @GetMapping(value = "/wid/{uuid}")
    public State getwentiList(@PathVariable("uuid") String uuid) {
        Wenti wenti = wentiService.getWenti( uuid );
        User user = null;
        try {
            user = userService.getUser( wenti.getUserid() );
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (user == null) {
            wenti.setUserid( "用户已注销!" );
        } else {
            wenti.setUserid( user.getName() );
        }
        Huati huati = null;
        try {
            huati = huatiService.getHuati( wenti.getHuati() );
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (huati == null) {
            wenti.setHuati( "话题已删除!" );
        } else {
            wenti.setHuati( huati.getWid() );
        }

        return new State( "200", wenti );
    }

    @GetMapping(value = "/wuid/{uuid}")
    public State getwuseridList(@PathVariable("uuid") String uuid) {
        List<Wenti> wenti = wentiService.getallWentiid( uuid );
        if (wenti.size() == 0) {
            return new State( "444", "该用户.没有发布问题!" );
        }
        for (Wenti w : wenti) {
            User user = null;
            try {
                user = userService.getUser( w.getUserid() );
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (user == null) {
                w.setUserid( "用户已注销!" );
            } else {
                w.setUserid( user.getName() );
            }
            Huati huati = null;
            try {
                huati = huatiService.getHuati( w.getHuati() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (huati == null) {
                w.setHuati( "话题已删除!" );
            } else {
                w.setHuati( huati.getWid() );
            }
        }
        return new State( "200", wenti );
    }


    @PostMapping(value = "/wadd")
    public State addwenti(@RequestBody Wenti wenti) {
        if (wenti == null) {
            return new State( "444", "无效数据,添加失败" );
        }

        if (wenti.getTimu().isEmpty()) {
            return new State( "444", "无效数据,题目不得为空" );
        }
        wenti.setUuid( IdUtil.objectId() );
        long pnglun1 = wentiService.insertWenti( wenti );
        if (pnglun1 > 0) {
            return new State( "200", "发布问题成功!" );
        }
        return new State( "444", "无效数据,添加失败" );
    }

    @GetMapping(value = "/wdel/{uuid}")
    public State deletwenti(@PathVariable("uuid") String uuid) {

        if (uuid.isEmpty()) {
            return new State( "444", "无效数据,删除失败" );
        }

        long pnglun1 = wentiService.deleteWenti( uuid );
        if (pnglun1 > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,删除失败" );
    }


    @PostMapping(value = "/wupdate")
    public State updatewenti(@RequestBody Wenti wenti) {

        if (wenti == null) {
            return new State( "444", "无效数据,修改失败" );
        }

        long pnglun1 = wentiService.updateWenti( wenti );
        if (pnglun1 > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,修改失败" );
    }


}
