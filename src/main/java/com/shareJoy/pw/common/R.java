package com.shareJoy.pw.common;


import lombok.Data;

import static com.shareJoy.pw.common.StatusCodeEnum.*;

/**
 * @author hjt
 * @created 2022/8/19 8:47
 */
@Data
public class R<T> {
    /**
     * 返回状态
     */
    private Boolean flag;
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    public static <T> R<T> ok() {
        return restR(true, null, SUCCESS.getCode(), SUCCESS.getDesc());
    }

    public static <T> R<T> ok(T data) {
        return restR(true, data, SUCCESS.getCode(), SUCCESS.getDesc());
    }

    public static <T> R<T> ok(T data, String message) {
        return restR(true, data, SUCCESS.getCode(), message);
    }

    public static <T> R<T> fail() {
        return restR(false, null, FAIL.getCode(), FAIL.getDesc());
    }

    public static <T> R<T> fail(StatusCodeEnum statusCodeEnum) {
        return restR(false, null, statusCodeEnum.getCode(), statusCodeEnum.getDesc());
    }

    public static <T> R<T> fail(String message) {
        return restR(false, message);
    }

    public static <T> R<T> fail(T data) {
        return restR(false, data, FAIL.getCode(), FAIL.getDesc());
    }

    public static <T> R<T> fail(T data, String message) {
        return restR(false, data, FAIL.getCode(), message);
    }

    public static <T> R<T> fail(Integer code, String message) {
        return restR(false, null, code, message);
    }

    private static <T> R<T> restR(Boolean flag, String message) {
        R<T> apiR = new R<>();
        apiR.setFlag(flag);
        apiR.setCode(flag ? SUCCESS.getCode() : FAIL.getCode());
        apiR.setMessage(message);
        return apiR;
    }

    private static <T> R<T> restR(Boolean flag, T data, Integer code, String message) {
        R<T> apiR = new R<>();
        apiR.setFlag(flag);
        apiR.setData(data);
        apiR.setCode(code);
        apiR.setMessage(message);
        return apiR;
    }
}
