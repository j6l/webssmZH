package com.jie.service;

import com.jie.entity.Huati;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
public interface HuatiService {

    List<Huati> getallHuatis();

    Huati getHuati(String id);

    long deleteHuati(String id);

    long insertHuati(Huati huati);

    long updateHuati(Huati huati);
}
