package com.single.projectbasemvvm;

import android.app.Application;

public class AppInfo extends Application {
    public static AppInfo instance;

    public static AppInfo getInstance() {
        if (instance == null)
            instance = new AppInfo();
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setInstance(this);
    }

    private void setInstance(AppInfo appInfo){
        instance = appInfo;
    }
}
