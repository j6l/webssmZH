package com.jie.web;

import cn.hutool.core.util.IdUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.jie.dto.State;
import com.jie.entity.Pinglun;
import com.jie.entity.User;
import com.jie.entity.Wenti;
import com.jie.service.iml.PinglunServiceiml;
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
public class PaihangController {

    private static final Log log = LogFactory.get();

    @Autowired
    private PinglunServiceiml pinglunService;
    @Autowired
    private WentiServiceiml wentiService;
    @Autowired
    private UserServiceiml userService;


    @PostMapping(value = "/plist")
    public State getlist() {

        List<Pinglun> pinglun = pinglunService.getallPingluns();
        for (Pinglun pl : pinglun) {
            Wenti wenti = null;
            try {
                wenti = wentiService.getWenti( pl.getWenti() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (wenti == null) {
                pl.setWenti( "问题已删除!" );
            } else {
                pl.setWenti( wenti.getTimu() );
            }
            User user = null;
            try {
                user = userService.getUser( pl.getUser() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (user == null) {
                pl.setUser( "用户已注销!" );
            } else {
                pl.setUser( user.getName() );
            }
        }
        if (pinglun == null) {
            return new State( "444", "无效数据,获取失败" );
        }
        return new State( "200", pinglun );
    }

    @RequestMapping(value = "/pid/{uuid}", method = RequestMethod.GET)
    public State getpingluninwenti(@PathVariable("uuid") String uuid) {

        List<Pinglun> pingluns = pinglunService.getallPinglunwentiid( uuid );
        if (pingluns == null) {
            return new State( "444", "无效数据,获取失败" );
        }
        for (Pinglun pl : pingluns) {
            Wenti wenti = null;
            try {
                wenti = wentiService.getWenti( pl.getWenti() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (wenti == null) {
                pl.setWenti( "问题已删除!" );
            } else {
                pl.setWenti( wenti.getTimu() );
            }
            User user = null;
            try {
                user = userService.getUser( pl.getUser() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (user == null) {
                pl.setUser( "用户已注销!" );
            } else {
                pl.setUser( user.getName() );
            }
        }
        return new State( "200", pingluns );
    }


    @RequestMapping(value = "/puid/{uuid}", method = RequestMethod.GET)
    public State getpingluninuser(@PathVariable("uuid") String uuid) {

        List<Pinglun> pingluns = pinglunService.getallPinglunid( uuid );
        if (pingluns == null) {
            return new State( "444", "无效数据,获取失败" );
        }
        for (Pinglun pl : pingluns) {
            Wenti wenti = null;
            try {
                wenti = wentiService.getWenti( pl.getWenti() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (wenti == null) {
                pl.setWenti( "问题已删除" );
                continue;
            }
            pl.setWenti( wenti.getTimu() );
            // pl.setUser(  userService.getUser( pl.getUser()).getName());
        }
        return new State( "200", pingluns );
    }


    @PostMapping(value = "/padd")
    public State addpinglunn(@RequestBody Pinglun pinglun) {

        if (pinglun == null) {
            return new State( "444", "无效数据,添加失败" );
        }
        pinglun.setUuid( IdUtil.objectId() );
        long pinglun1 = pinglunService.insertPinglun( pinglun );
        if (pinglun1 > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,添加失败" );
    }

    @GetMapping(value = "/pdel/{uuid}")
    public State deletpinglun(@PathVariable("uuid") String uuid) {

        if (uuid.isEmpty()) {
            return new State( "444", "无效数据,删除失败" );
        }

        long pnglun1 = pinglunService.deletePinglun( uuid );
        if (pnglun1 > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,删除失败" );
    }


    @PostMapping(value = "/pupdate")
    public State updatepinglun(@RequestBody Pinglun pinglun) {

        if (pinglun == null) {
            return new State( "444", "无效数据,修改失败" );
        }

        long pnglun1 = pinglunService.updatePinglun( pinglun );
        if (pnglun1 > 0) {
            return new State( "200", "true" );
        }

        return new State( "444", "无效数据,删除失败" );
    }


}
