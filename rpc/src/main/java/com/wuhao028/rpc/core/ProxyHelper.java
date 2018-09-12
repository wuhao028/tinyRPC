package com.wuhao028.rpc.core;

import com.wuhao028.rpc.request.RpcRequest;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by WuHao028 on 2018/9/12
 */

public class ProxyHelper implements InvocationHandler {

    private String className;
    public ProxyHelper(String className){
        this.className=className;
    }

    public Object bind(Class<?>[] interfaces) {
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), interfaces, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequest request = new RpcRequest();
        request.setMethodName(method.getName());
        request.setClassName(className);
        request.setParamsValues(Arrays.asList(args));
        Class[] sourceTypes = method.getParameterTypes();
        List<String> paramsTypeName = new ArrayList<String>();

        for (int i = 0; i < args.length; i++) {
            paramsTypeName.add(sourceTypes[i].getName());
        }
        request.setParamsTypesName(paramsTypeName);

        Class returnClass = method.getReturnType();

        return RequestHandler.request(className, request, returnClass);

    }
}
