package com.hxm.httplib.http;

import com.hxm.httplib.Book;
import com.hxm.httplib.http.manger.HttpManger;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by hxm on 2017/7/6.
 * 描述：
 */
@SuppressWarnings("unchecked")
public class Request {
    private static Retrofit retrofit = HttpManger.getInstance().getRetrofit();
    private static ApiService service = retrofit.create(ApiService.class);
    private Observable.Transformer transformer = HttpManger.getInstance().BaseTransformer();

    public static Request getInstance() {
        return RequestHolder.request;
    }

    public Observable<Book> searchBook(String keyword, int count) {
        return service.searchBook(keyword, "", 0, count).compose(transformer);
    }

    private static class RequestHolder {
        private static final Request request = new Request();
    }
}
