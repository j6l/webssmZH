package com.jie.service;

import com.jie.entity.Wenti;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
public interface WentiService {

    List<Wenti> getallWentis();

    List<Wenti> getallWentiid(String id);

    List<Wenti> getallhuatiid(String id);

    List<Wenti> getallWentiname(String name);

    Wenti getWenti(String id);

    long deleteWenti(String id);

    long insertWenti(Wenti wenti);

    long updateWenti(Wenti wenti);
}
