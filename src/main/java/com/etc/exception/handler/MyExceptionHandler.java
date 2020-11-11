package com.etc.exception.handler;

import com.etc.entity.JsonResult;
import com.etc.exception.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {
    private final static Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public JsonResult handler(Exception e){
        logger.error("【系统异常】："+e);
        return new JsonResult(-1,e.getMessage());
    }

    @ExceptionHandler(value= MyException.class)
    @ResponseBody
    public JsonResult myHandler(MyException e){
        logger.error("【操作异常】："+e);
        return new JsonResult(e.getCode(),e.getMessage());
    }
}
