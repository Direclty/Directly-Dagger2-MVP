package com.directly.luckyboard.core.bean;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:14
 */

public class BaseResponse<T> {
    /**
     * 状态码
     */
    public int errorCode;
    /**
     * 返回码
     */
    public String errorMessage;

    /**
     * 返回信息
     */
    public T data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
