package com.jie.util;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/28
 * WWW https://github.com/j6l
 */
public class LoginInterceptor implements HandlerInterceptor {

    private static final Log log = LogFactory.get();
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("拦截器起作用了");
        String token = request.getHeader("user_token");
        StringBuffer url = request.getRequestURL();
        log.info("url "+url);
        log.info("token "+token);
        // Cookie[] cookies = request.getCookies();
        // for(Cookie cookie : cookies){
        //     System.out.println("cookieName:"+cookie.getName()+",cookieValue:"+ cookie.getValue());
        // }

        //token不存在
        // if (null != token) {
        //     //验证token是否正确
        //     boolean result = Jwt.verify(token);
        //     if (result) {
        //         return true;
        //     }
        // }
        // return false;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
