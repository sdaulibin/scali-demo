package com.sdjictec.scalidemo.sentinel.nacos.dto;

public class ResponseObject {
    private String code; //结果编码，0-固定代表处理成功
    private String message;//响应消息
    private Object data;//响应附加数据（可选）

    public ResponseObject(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
