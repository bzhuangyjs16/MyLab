package com.wildCrane.utils;

import com.alibaba.fastjson.JSONObject;
import com.wildCrane.constants.enums.HttpStatusEnum;
import com.wildCrane.exception.ServiceException;

public class ResultBody {
    /**
     * 响应代码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object data;

    public ResultBody() {
    }

    public ResultBody(ServiceException e) {
        this.code = e.getErrorCode();
        this.message = e.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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

    /**
     * 成功
     *
     * @return
     */
    public static ResultBody success() {
        return success(null);
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static ResultBody success(Object data) {
        ResultBody rb = new ResultBody();
        rb.setCode(HttpStatusEnum.OK.getCode());
        rb.setMessage(HttpStatusEnum.OK.getReasonPhraseCN());
        rb.setData(data);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error(Integer code, String message) {
        ResultBody rb = new ResultBody();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setData(null);
        return rb;
    }
    /**
     * 失败
     */
    public static ResultBody error(String message,Exception e) {
        ResultBody rb = new ResultBody();
        rb.setCode(500);
        rb.setMessage(message);
        rb.setData(null);
        return rb;
    }
    /**
     * 失败
     */
    public static ResultBody error(String message) {
        ResultBody rb = new ResultBody();
        rb.setCode(HttpStatusEnum.BAD_REQUEST.getCode());
        rb.setMessage(message);
        rb.setData(null);
        return rb;
    }
    /**
     * 失败
     */
    public static ResultBody error(Exception e) {
        ResultBody rb = new ResultBody();
        rb.setCode(500);
        rb.setMessage(e.toString());
        rb.setData(null);
        return rb;
    }
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
