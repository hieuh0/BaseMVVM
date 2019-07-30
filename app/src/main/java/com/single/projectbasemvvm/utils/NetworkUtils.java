package com.single.projectbasemvvm.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.single.projectbasemvvm.AppInfo;

public class NetworkUtils {

    public boolean isNetworkConnected() {
        ConnectivityManager cm =
                (ConnectivityManager) AppInfo.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
}
