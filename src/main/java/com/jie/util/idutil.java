package com.jie.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;

import java.util.Date;
import java.util.HashMap;
import com.jie.util.Jwt;

import static com.jie.util.Jwt.token;
import static com.jie.util.Jwt.verify;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
public class idutil {
    // public static void main(String[] args) {
    //     System.out.println( IdUtil.objectId() );
    //     Date date = DateUtil.parse( "Wed Jun 17 21:49:57 CST 2020" );
    //     String time = DateUtil.formatDateTime( date );
    //     System.out.println( time );
    //
    //     Jwt qqq = new Jwt();
    //
    //     String username ="zhangsan";
    //     String password = "123";
    //     String token = token(username,password);
    //     System.out.println(token);
    //     boolean b = verify(token);
    //     System.out.println(b);
    //
    //     System.out.println( qqq.getUserId( token ) );
    //     System.out.println( ApiResponseEnum.SUCCESS );
    // }

}
