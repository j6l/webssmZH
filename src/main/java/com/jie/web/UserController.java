package com.jie.web;

import cn.hutool.core.util.IdUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.jie.dto.State;
import com.jie.entity.User;
import com.jie.service.iml.UserServiceiml;
import com.jie.util.Jwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
public class UserController {

    private static final Log log = LogFactory.get();

    @Autowired
    private UserServiceiml userService;


    @PostMapping(value = "/login")
    public State login(@RequestBody User user) {

        User user1 = userService.getUsername( user.getName() );

        if (user1 == null) {
            return new State( "444", "无效数据,登录失败" );
        }
        if (user1.getPassword().equals( user.getPassword() )) {
            if (user1.getIsout().equals( "0" )) {
                new State( "444", "账号已被锁定!" );
            }
            String token = Jwt.token( user1.getName(), user1.getRole() );
            HashMap<String, Object> map = new HashMap<>();
            map.put( "user",user1 );
            map.put( "token",token );
            return new State( "200", map );
        }

        return new State( "444", "无效数据,账号或密码错误" );
    }

    @GetMapping(value = "/ulist")
    public State getlist() {

        List<User> users = userService.getallUsers();
        if (users == null) {
            return new State( "444", "无效数据,获取失败" );
        }
        return new State( "200", users );
    }

    @GetMapping(value = "/uuser/{uuid}")
    public State getuser(@PathVariable("uuid") String uuid) {
        User user = userService.getUser( uuid );
        if (user == null) {
            return new State( "444", "无效数据,获取失败" );
        }
        return new State( "200", user );
    }

    @PostMapping(value = "/uadd")
    public State adduser(@RequestBody User user) {
        if (user == null) {
            return new State( "444", "无效数据,添加失败" );
        }
        user.setUuid( IdUtil.objectId() );
        long user1 = userService.insertUser( user );
        if (user1 > 0) {
            return new State( "200", "添加成功!" );
        }

        return new State( "444", "无效数据,添加失败" );
    }

    @GetMapping(value = "/udel/{uuid}")
    public State deletuser(@PathVariable("uuid") String uuid) {
        if (uuid.isEmpty()) {
            return new State( "444", "无效数据,删除失败" );
        }

        long user1 = userService.deleteUser( uuid );
        if (user1 > 0) {
            return new State( "200", "删除成功!" );
        }

        return new State( "444", "无效数据,删除失败" );
    }


    @PostMapping(value = "/uupdate")
    public State updateuser(@RequestBody User user) {
        log.info( user.toString() );
        if (user == null) {
            return new State( "444", "无效数据,修改失败" );
        }

        long user1 = userService.updateUser( user );
        if (user1 > 0) {
            return new State( "200", "修改成功!" );
        }

        return new State( "444", "无效数据,修改失败" );
    }


}
