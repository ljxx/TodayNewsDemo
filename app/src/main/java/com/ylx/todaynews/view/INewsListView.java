package com.ylx.todaynews.view;

import com.ylx.todaynews.model.News;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
public interface INewsListView {
    void onGetNewsListSuccess(List<News> response);

}
