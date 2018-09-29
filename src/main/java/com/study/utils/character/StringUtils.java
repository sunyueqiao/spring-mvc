package com.study.utils.character;

import java.util.regex.Pattern;

/**
 * 字符串帮助类
 *
 * @author sunyueqiao
 * @date 2018/9/29
 */
public class StringUtils {
    /**
     * 字符串是否为手机号
     *
     * @param data
     * @return
     */
    public static boolean stringIsMobile(String data) {
        return Pattern.matches(RegexConstant.MOBILE, data);
    }

    /**
     * 字符串是否为邮箱
     *
     * @param data
     * @return
     */
    public static boolean stringIsEmail(String data) {
        return Pattern.matches(RegexConstant.EMAIL, data);
    }
}
