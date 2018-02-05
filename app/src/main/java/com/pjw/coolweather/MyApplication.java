package com.pjw.coolweather;

import android.app.Application;

import org.litepal.LitePal;

/**
 * @ClassName: CoolWeather
 * @Description:
 * @Author Pjw
 * @date 2018/2/5 15:30
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
