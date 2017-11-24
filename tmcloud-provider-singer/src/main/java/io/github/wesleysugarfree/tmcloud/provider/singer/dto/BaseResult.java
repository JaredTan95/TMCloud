/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author tanjian
 * @Description: 返回值统一封装类
 * @date 2017年7月26日
 */
public class BaseResult<T extends Object> implements Serializable {


    private static final long serialVersionUID = 1368407471638948451L;

    /*请求是否成功*/
    public Boolean success;

    /*请求获取内容*/
    private T content;

    private List<T> contentLists;

    /*附加信息*/
    private String message;

    /*响应状态码*/
    //默认状态码为200，代表请求成功。
    private String code = "200";

    public BaseResult() {
    }

    public BaseResult(T content) {
        this.content = content;
        success = true;
    }

    public BaseResult(String code, String message) {
        this.message = message;
        this.code = code;
        success = false;
    }

    public BaseResult(Boolean success, String message) {
        this.message = message;
        this.success = success;
    }

    public BaseResult(Boolean success, String code, String message) {
        this.message = message;
        this.code = code;
        this.success = success;
    }

    public BaseResult(Boolean success, T content, String code, String message) {
        this.message = message;
        this.code = code;
        this.content = content;
        this.success = success;
    }

    /*带有列表参数的构造函数*/
    public BaseResult(Boolean success, List<T> contentLists, String message, String code) {
        this.success = success;
        this.contentLists = contentLists;
        this.message = message;
        this.code = code;
    }

    public BaseResult<T> success(String message) {
        this.setSuccess(true);
        this.setMessage(message);
        return this;
    }

    public BaseResult<T> failure(String message) {
        this.setSuccess(false);
        this.setMessage(message);
        return this;
    }

    public BaseResult<T> content(T t) {
        this.setContent(t);
        return this;
    }

    public BaseResult<T> code(String code) {
        this.setCode(code);
        return this;
    }

    public BaseResult<T> successContent(T t) {
        this.content(t);
        this.success = true;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public BaseResult<T> setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public T getContent() {
        return content;
    }

    public BaseResult<T> setContent(T content) {
        this.content = content;
        return this;
    }

    public List<T> getContentLists() {
        return contentLists;
    }

    public void setContentLists(List<T> contentLists) {
        this.contentLists = contentLists;
    }

    public String getMessage() {
        return message;
    }

    public BaseResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getCode() {
        return code;
    }

    public BaseResult<T> setCode(String code) {
        this.code = code;
        return this;
    }
}