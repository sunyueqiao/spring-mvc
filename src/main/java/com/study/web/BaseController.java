package com.study.web;

import com.study.domain.model.ResponseResult;
import org.apache.commons.lang3.StringUtils;

/**
 * @author sunyueqiao
 * @date 2018/9/29
 */
public class BaseController {
    protected <T> ResponseResult<T> createError(T data, String msg) {
        return new ResponseResult<T>(false, 200, data, msg);
    }

    protected <T> ResponseResult<T> createError(T data) {
        return this.createError(data, StringUtils.EMPTY);
    }

    protected <T> ResponseResult<T> createSuccess(T data, String msg) {
        return new ResponseResult<T>(true, 200, data, msg);
    }

    protected <T> ResponseResult<T> createSuccess(T data) {
        return new ResponseResult<T>(true, 200, data, StringUtils.EMPTY);
    }
}
