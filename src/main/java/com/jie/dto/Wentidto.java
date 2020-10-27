package com.jie.dto;

import com.jie.entity.Pinglun;
import com.jie.entity.Wenti;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
public class Wentidto {

    private Wenti wenti;
    private List<Pinglun> pinglun;

    public Wenti getWenti() {
        return wenti;
    }

    public void setWenti(Wenti wenti) {
        this.wenti = wenti;
    }

    public List<Pinglun> getPinglun() {
        return pinglun;
    }

    public void setPinglun(List<Pinglun> pinglun) {
        this.pinglun = pinglun;
    }
}
