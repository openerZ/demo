package com.example.demo.utils;

public class ExcptionResult {

    private String code;
    private String msg;

    public ExcptionResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ExcptionResult(String msg){
        this.msg=msg;
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
