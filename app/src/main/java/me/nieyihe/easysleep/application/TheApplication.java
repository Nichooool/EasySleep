package me.nieyihe.easysleep.application;

import android.app.Application;

import com.tendcloud.tenddata.TCAgent;
import com.umeng.analytics.MobclickAgent;

/**
 * 作者：nieyihe on 2017/2/20 22:17
 * 邮箱：18303019013@163.com
 * 包名: me.nieyihe.easysleep.application
 */

public class TheApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //takingdata
        TCAgent.setReportUncaughtExceptions(true);
        //友盟
        MobclickAgent.setScenarioType(getApplicationContext(), MobclickAgent.EScenarioType.E_UM_NORMAL);
        MobclickAgent.setCatchUncaughtExceptions(true);
    }
}
