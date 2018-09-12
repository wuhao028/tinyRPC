package com.wuhao028.rpc.core;


/**
 * Created by WuHao028 on 2018/9/12
 */

public class RpcServiceFactory {

    public static <T> T create(Class<?> type) {

        ProxyHelper helper = new ProxyHelper(type.getSimpleName());

        return (T) helper.bind(new Class<?>[]{type});
    }

}
