package com.wuzp.weixin_pickavatar;

import android.app.Application;
import android.content.Context;

public class HApplication extends Application {

    public static Context gContext;

    @Override
    public void onCreate() {
        super.onCreate();
        gContext = this;
    }
}
