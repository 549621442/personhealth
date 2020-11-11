package com.etc.exception;

import com.etc.Enum.ErrorEnum;

public class MyException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public MyException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public MyException(ErrorEnum errorEnum){
        super(errorEnum.getMsg());
        this.code = errorEnum.getCode();
    }

    public MyException(ErrorEnum errorEnum,String message){
        super(message);
        this.code = errorEnum.getCode();
    }
}
