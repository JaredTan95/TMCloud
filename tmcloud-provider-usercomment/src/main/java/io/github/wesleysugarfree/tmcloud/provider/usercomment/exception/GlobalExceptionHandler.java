/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.usercomment.exception;


import io.github.wesleysugarfree.tmcloud.provider.usercomment.dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常处理类
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResult<Boolean> errorHandler(Exception e) {
        BaseResult<Boolean> br = new BaseResult<>();
        br.setSuccess(false);
        br.setCode("500");
        br.setMessage(e.getMessage());
        logger.info("Exception:  code:{},Message:{}", br.getCode(), br.getMessage());
        return br;
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public BaseResult<Boolean> errorHandler(BusinessException e) {
        BaseResult<Boolean> br = new BaseResult<>();
        br.setSuccess(false);
        br.setCode(e.getCode());
        br.setMessage(e.getMessage());
        logger.info("BusinessException: code:{},Message:{}", br.getCode(), br.getMessage());
        return br;
    }
}