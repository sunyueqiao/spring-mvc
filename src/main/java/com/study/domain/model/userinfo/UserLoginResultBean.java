package com.study.domain.model.userinfo;

/**
 * @author sunyueqiao
 * @date 2018/9/29
 */
public class UserLoginResultBean {
    private boolean success;
    private String message;

    public UserLoginResultBean() {

    }

    public UserLoginResultBean(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
