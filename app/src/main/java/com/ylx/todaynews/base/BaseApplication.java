package com.ylx.todaynews.base;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.ylx.todaynews.BuildConfig;
import com.ylx.todaynews.theme.colorUi.util.SharedPreferencesMgr;

import org.litepal.LitePal;

/**
 * Created by RayYeung on 2016/8/8.
 */
public class BaseApplication extends Application {
    //private UserInfo userInfo;
    private static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        SharedPreferencesMgr.init(this, "weyye");
        initImageLoader();

        //初始化数据库类库
        LitePal.initialize(this);
    }

    private void initImageLoader() {
        ImageLoaderConfiguration.Builder config = new ImageLoaderConfiguration.Builder(
                instance);
        config.memoryCacheExtraOptions(480, 800);
        config.diskCacheExtraOptions(480, 800, null);
        config.diskCacheSize(100 * 1024 * 1024); // 100 MiB
        if (BuildConfig.DEBUG) {
            config.writeDebugLogs(); // Remove for release app
        }
        ImageLoader.getInstance().init(config.build());
    }

    public static BaseApplication getInstance() {
        return instance;
    }
}
