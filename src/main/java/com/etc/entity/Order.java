package com.etc.entity;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.oid
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    private Integer oid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.uid
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.item
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    private String item;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.amount
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    private Double amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.oid
     *
     * @return the value of order.oid
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.oid
     *
     * @param oid the value for order.oid
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.uid
     *
     * @return the value of order.uid
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.uid
     *
     * @param uid the value for order.uid
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.item
     *
     * @return the value of order.item
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public String getItem() {
        return item;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.item
     *
     * @param item the value for order.item
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.amount
     *
     * @return the value of order.amount
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.amount
     *
     * @param amount the value for order.amount
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status
     *
     * @return the value of order.status
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status
     *
     * @param status the value for order.status
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    public void setStatus(String status) {
        this.status = status;
    }
}