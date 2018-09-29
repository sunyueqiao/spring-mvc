package com.study.domain.model.userinfo;

/**
 * @author sunyueqiao
 * @date 2018/9/29
 */
public class UserLoginInputBean {
    /**
     * 用户名()
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
