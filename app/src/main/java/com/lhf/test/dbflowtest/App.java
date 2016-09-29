package com.lhf.test.dbflowtest;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * com.lhf.test.dbflowtest
 * Created by zeratel3000
 * on 2016 09 16/9/29 14 39
 * description
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this).build());
    }
}
