package com.wuhao028.rpc.response;

/**
 * Created by WuHao028 on 2018/9/12
 */
public class RpcResponse {

    //is success
    private boolean isSuccess;
    private Exception exception;
    // the result
    private byte[] data;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
