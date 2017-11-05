/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.common.exception;

import io.github.wesleysugarfree.tmcloud.common.dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger =  LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResult<Boolean> errorHandler(Exception e) {
        BaseResult<Boolean> br = new BaseResult<>();
        br.setCode("500");
        br.setMessage(e.getMessage());
        return br;
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public BaseResult<Boolean> errorHandler(BusinessException e) {
        BaseResult<Boolean> br = new BaseResult<>();
        br.setCode(e.getCode());
        br.setMessage("server internal error.");
        return br;
    }
}