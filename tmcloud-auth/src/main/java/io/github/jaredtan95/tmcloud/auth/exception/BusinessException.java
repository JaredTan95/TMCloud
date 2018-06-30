/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.jaredtan95.tmcloud.auth.exception;

/**
 * 业务异常类
 */
public class BusinessException extends RuntimeException {

    private String code = "500";
    private String msg;

    public BusinessException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
