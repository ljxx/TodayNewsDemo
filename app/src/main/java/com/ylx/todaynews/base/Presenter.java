package com.ylx.todaynews.base;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}
