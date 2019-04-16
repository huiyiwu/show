package com.show;

import android.app.Application;
import android.content.Context;


/**
 * Created by Administrator on 2018/12/25 0025.
 */

public class App extends Application {

    private static Context mContext;
//    private static SPUtil mSputil;
//    private static Api api;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
//        mSputil = new SPUtil(this);
//        api = new Api(this);
        new AppError().initUncaught();
//        ToastUtil.register(this);
//        Glide.get(this).register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(Api.getOkHttpClient()));


//        HttpsUtils.SSLParams sslParams = HttpsUtils.getSslSocketFactory(null, null, null);
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager)
//                //其他配置
//                .build();
//        OkHttpUtils.initClient(okHttpClient);
    }

//    public static Api getApi() {
//        return api;
//    }
//
//    public static SPUtil getSputil() {
//        return mSputil;
//    }

    public static Context getContext() {
        return mContext;
    }

}
