package com.jie.service;

import com.jie.entity.Pinglun;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
public interface PinglunService {

    List<Pinglun> getallPingluns();

    List<Pinglun> getallPinglunid(String id);

    List<Pinglun> getallPinglunwentiid(String id);

    Pinglun getPinglun(String id);

    long deletePinglun(String id);

    long insertPinglun(Pinglun pinglun);

    long updatePinglun(Pinglun pinglun);
}
