package com.hxm.httplib.http;

import com.hxm.httplib.Book;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by hxm on 2017/7/6.
 * 描述：
 */
public interface ApiService {

    /**
     * Get写法
     *
     * @param keyword
     * @param tag
     * @param start
     * @param count
     * @return
     */
    @GET("v2/book/search")
    Observable<Book> searchBook(@Query("q") String keyword, @Query("tag") String tag,
                                @Query("start") int start, @Query("count") int count);

    /**
     * Get动态url https://api.douban.com/v2/book/search
     *
     * @param keyword
     * @param tag
     * @param start
     * @param count
     * @return
     */
    @GET()
    Observable<Book> searchBook2(@Url String url, @Query("p") String keyword, @Query("tag") String tag,
                                 @Query("start") int start, @Query("count") int count);


}
