package com.etc.Enum;

public enum ErrorEnum {
    UNKNOWN_ERROR(1,"未知错误"),
    ADD_FAIL(101,"添加异常"),
    REMOVE_FAIL(102,"删除异常"),
    EDIT_FAIL(103,"修改异常"),
    FIND_FAIL(104,"查询异常"),
    BALANCE_ERROR(201,"余额不足"),
    HAVEN_LOGIN(202,"未登录"),
    IDENTIFY_FAIL(203,"身份认证失败"),
    NAMEORPWD_ERROR(204,"账号或密码错误"),
    NOTVIP_ERROR(205,"用户非会员无法访问");
    
    
    private  Integer code;
    private String msg;
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code= code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    private ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    private ErrorEnum(Integer code) {
        this.code = code;
    }
}
