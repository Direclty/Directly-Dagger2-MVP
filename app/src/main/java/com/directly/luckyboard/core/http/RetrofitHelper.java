package com.directly.luckyboard.core.http;

import com.directly.luckyboard.core.bean.BaseResponse;
import com.directly.luckyboard.core.bean.news.NewsData;
import com.directly.luckyboard.core.http.api.GeeksApis;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:45
 */

public class RetrofitHelper implements HttpHelper {

    private GeeksApis mGeeksApis;

    @Inject
    RetrofitHelper(GeeksApis geeksApis) {
        mGeeksApis = geeksApis;
    }

    @Override
    public Observable<BaseResponse<NewsData>> getNewsList(int params) {
        return mGeeksApis.getNewsList(params);
    }
}
