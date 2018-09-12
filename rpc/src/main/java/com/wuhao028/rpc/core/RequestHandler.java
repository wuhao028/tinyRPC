package com.wuhao028.rpc.core;

import android.content.Context;
import android.util.Log;

import com.wuhao028.rpc.request.RpcRequest;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

/**
 * Created by WuHao028 on 2018/9/12
 */
public class RequestHandler {

    private static RequestHandler requestHandler;
    private String serverURL;

    private RequestHandler(){}

    public static RequestHandler getRequestHandler() {
        if(requestHandler==null){
            requestHandler=new RequestHandler();
        }
        return requestHandler;
    }

    public void init(Context context){
        Properties props = new Properties();
        try {
            InputStream in = context.getAssets().open("config");
            props.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d("RequestHandler",props.getProperty("serverUrl"));
        serverURL=props.getProperty("serverUrl");
    }

    public Object request(String className, RpcRequest request, Class returnType) {

        try {
            URL url=new URL(serverURL);
            URLConnection connection=url.openConnection();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;

    }

}
