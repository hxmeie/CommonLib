package com.hxm.httplib;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by hxm on 2017/7/6.
 * 描述：
 */
public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
