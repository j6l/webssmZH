package com.jie.dto;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
public class State {

    private String state;
    private Object t;

    public State(String state, Object t) {
        this.state = state;
        this.t = t;
    }

    public State() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }
}
