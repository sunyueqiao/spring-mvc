package com.study.domain.model;

import org.apache.commons.lang3.StringUtils;

/**
 * @author sunyueqiao
 * @date 2018/9/29
 */
public class ResponseResult<T> {
    private boolean success;
    private int code;
    private T data;
    private String message;

    public ResponseResult(boolean success, int code, T data, String message) {
        this.success = success;
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ResponseResult(T data) {
        this(true, 200, data, StringUtils.EMPTY);
    }

    public ResponseResult() {
        this(true, 200, null, StringUtils.EMPTY);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
