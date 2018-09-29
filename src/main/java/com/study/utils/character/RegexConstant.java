package com.study.utils.character;

/**
 * @author sunyueqiao
 * @date 2018/9/29
 */
public class RegexConstant {
    /**
     * 手机号正则
     */
    public final static String MOBILE = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
    /**
     * 邮箱正则
     */
    public final static String EMAIL = "^([a-z0-9A-Z]+[-|\\\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则表达式：验证汉字
     */
    public static final String CHINESE = "^[\u4e00-\u9fa5],{0,}$";
}
