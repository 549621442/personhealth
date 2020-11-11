package com.etc.entity;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class JsonResult<T> {
    public static final int SUCCESS = 0;

    private int state;
    private String msg="";
    private T data;
    private List<T> datas;
    private PageInfo<T> pagedatas;
    private long total;
    private List<T> rows;

    //成功的情况
    public JsonResult(String msg){
        this.state = SUCCESS;
        this.msg = msg;
    }
    public JsonResult(T data){
        this.state = SUCCESS;
        this.data = data;
    }
    public JsonResult(List<T> datas){
        this.state = SUCCESS;
        this.datas = datas;
    }
    public JsonResult(PageInfo<T> pagedatas){
        this.state = SUCCESS;
        this.pagedatas = pagedatas;
    }

    //失败的情况
    public JsonResult(int state,String msg){
        this.state = state;
        this.msg = msg;
    }


    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public List<T> getDatas() {
        return datas;
    }
    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
    public PageInfo<T> getPagedatas() {
        return pagedatas;
    }
    public void setPagedatas(PageInfo<T> pagedatas) {
        this.pagedatas = pagedatas;
    }

    //适配bootstrap-table
    public long getTotal(){
        return pagedatas!=null?pagedatas.getTotal():0;
    }
    public List<T> getRows(){
        return pagedatas!=null?pagedatas.getList():null;
    }
}
