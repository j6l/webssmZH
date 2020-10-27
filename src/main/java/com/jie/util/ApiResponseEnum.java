package com.jie.util;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/7/4
 * WWW https://github.com/j6l
 */
public enum ApiResponseEnum {
    /**
     * API调用成功返回
     */
    SUCCESS(200,"请求成功"),
    FAIL(444,"请求失败"),
    LOGIN_FAIL(4442,"登陆失败"),
    AUTH_ERROR(4441,"认证失败");

    private int errCode = 0;

    private String errMsg;


    ApiResponseEnum(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

}
