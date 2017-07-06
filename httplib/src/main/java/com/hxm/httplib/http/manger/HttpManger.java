package com.hxm.httplib.http.manger;

import com.hxm.httplib.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by HXM on 2016/11/23.
 * 描述：http管理类
 */

public class HttpManger {
    private Retrofit retrofit;

    private HttpManger() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        } else {
            interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        }
        //缓存
//        File httpCacheDirectory = new File(AppContext.getInstance().getCacheDir(), "http");
//        int cacheSize = 20 * 1024 * 1024; // 20 MiB
//        Cache cache = new Cache(httpCacheDirectory, cacheSize);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
//                .addInterceptor(new CacheInterceptor())
                .retryOnConnectionFailure(true)
//                .cache(cache)
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .build();
        retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.douban.com/")//替换自己的,必须以/结尾
                .client(client)
                .build();
    }

    /**
     * 获取HttpManger实例
     *
     * @return HttpManger
     */
    public static HttpManger getInstance() {
        return HttpMangerHolder.instance;
    }

    /**
     * transformer
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public Observable.Transformer ThrowableTransformer() {
        return new Observable.Transformer() {
            @Override
            public Object call(Object observable) {
                return ((Observable) observable).onErrorResumeNext(new HttpResponseFunc<>());
            }
        };
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    /**
     * 线程切换,错误反馈
     *
     * @param <T>
     * @return
     */
    public <T> Observable.Transformer<T, T> BaseTransformer() {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> tObservable) {
                return tObservable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .onErrorResumeNext(new HttpResponseFunc<T>());
            }
        };
    }

    private static class HttpMangerHolder {
        private static final HttpManger instance = new HttpManger();
    }

    /**
     * 将Throwable转化为ResponseThrowable
     *
     * @param <T>
     */
    private class HttpResponseFunc<T> implements Func1<Throwable, Observable<T>> {
        @Override
        public Observable<T> call(Throwable t) {
            return Observable.error(NetException.throwable(t));
        }
    }

}
