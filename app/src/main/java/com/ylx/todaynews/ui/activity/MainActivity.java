package com.ylx.todaynews.ui.activity;

import android.os.Bundle;

import com.ylx.todaynews.R;
import com.ylx.todaynews.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected void loadViewLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void bindViews() {
//        SQLiteDatabase sqLiteDatabase = Connector.getDatabase();
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {

    }

    @Override
    protected void setListener() {

    }
}
