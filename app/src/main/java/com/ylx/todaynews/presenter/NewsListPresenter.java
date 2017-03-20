package com.ylx.todaynews.presenter;

import com.orhanobut.logger.Logger;
import com.ylx.todaynews.base.AppClient;
import com.ylx.todaynews.base.BasePresenter;
import com.ylx.todaynews.base.SubscriberCallBack;
import com.ylx.todaynews.model.News;
import com.ylx.todaynews.view.INewsListView;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
public class NewsListPresenter extends BasePresenter<INewsListView> {
    public NewsListPresenter(INewsListView mvpView) {
        super(mvpView);
    }

    public void getNewsList(String titleCode) {
        addSubscription(AppClient.getApiService().getNews(titleCode), new SubscriberCallBack<List<News>>() {
            @Override
            protected void onSuccess(List<News> response) {
                Logger.i(response.toString());
                mvpView.onGetNewsListSuccess(response);

            }

        });
    }
}
