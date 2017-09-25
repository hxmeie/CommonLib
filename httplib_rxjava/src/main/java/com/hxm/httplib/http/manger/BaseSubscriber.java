package com.hxm.httplib.http.manger;

import com.hxm.httplib.BuildConfig;

import rx.Subscriber;

/**
 * Created by Hxm on 2017/2/22.
 * Base Subscriber
 */

public abstract class BaseSubscriber<T> extends Subscriber<T> {
    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        //debug时，运行时异常直接抛出，不处理
        if (BuildConfig.DEBUG && e instanceof RuntimeException) {
            throw new RuntimeException(e);
        }
        if (e instanceof NetException.ResponseThrowable) {
            onError((NetException.ResponseThrowable) e);
        } else {
            onError(new NetException.ResponseThrowable(e, NetException.ERROR.UNKNOWN));
        }
    }

    public abstract void onError(NetException.ResponseThrowable e);
}
