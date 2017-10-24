package com.qizhu.qizhugoshshopping.app;

import android.app.Application;
import android.content.Context;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by Long° Engagement on 2017/10/15.
 */
public class MyApp  extends Application{

    private static Context instance;

    public static Context getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        ImageLoaderConfiguration imageLoaderConfiguration = ImageLoaderConfiguration.createDefault(getApplicationContext());
        ImageLoader.getInstance().init(imageLoaderConfiguration);
    }
}
