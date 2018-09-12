package com.wuhao028.rpc.request;

import android.print.PrinterId;

import java.util.List;

/**
 * Created by WuHao028 on 2018/9/12
 */
public class RpcRequest {

    //the class to call
    private String className;
    //the method called
    private String methodName;
    //the parameter type class name
    private List<String> paramsTypesName;
    //the parameters
    private List<Object> paramsValues;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<String> getParamsTypesName() {
        return paramsTypesName;
    }

    public void setParamsTypesName(List<String> paramsTypesName) {
        this.paramsTypesName = paramsTypesName;
    }

    public List<Object> getParamsValues() {
        return paramsValues;
    }

    public void setParamsValues(List<Object> paramsValues) {
        this.paramsValues = paramsValues;
    }
}
