package com.thirteen.oph.restresult;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Result<T> {
    private T result = null;
    private List<T> list = null;
    private int intResult = 0;
    private String stringResult = null;
    private double doubleResult = 0.0;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateResulte = null;
    
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }
    public List<T> getList() {
        return list;
    }
    public void setList(List<T> list) {
        this.list = list;
    }
    public int getIntResult() {
        return intResult;
    }
    public void setIntResult(int intResult) {
        this.intResult = intResult;
    }
    public String getStringResult() {
        return stringResult;
    }
    public void setStringResult(String stringResult) {
        this.stringResult = stringResult;
    }
    public double getDoubleResult() {
        return doubleResult;
    }
    public void setDoubleResult(double doubleResult) {
        this.doubleResult = doubleResult;
    }
    public Date getDateResulte() {
        return dateResulte;
    }
    public void setDateResulte(Date dateResulte) {
        this.dateResulte = dateResulte;
    }
    public Date getTimeResult() {
        return timeResult;
    }
    public void setTimeResult(Date timeResult) {
        this.timeResult = timeResult;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date timeResult = null;
    private String status = null; // OK, ERROR
    private String message = null;
}
