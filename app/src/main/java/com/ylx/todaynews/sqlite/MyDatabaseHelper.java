package com.ylx.todaynews.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/3/21  下午9:33
 * <p/>
 * 描 述：1、SQLiteOpenHelper抽象类，实现该类用于创建数据库和数据库版本更新
 *       2、SQLiteDataBase 对数据进行增删改查
 *       3、Cursor 游标接口，在数据库中作为返回值，相当于结果集 ResultSet
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class MyDatabaseHelper extends SQLiteOpenHelper {


    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
