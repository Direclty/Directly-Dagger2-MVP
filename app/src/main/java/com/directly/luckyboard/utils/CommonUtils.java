package com.directly.luckyboard.utils;

import android.content.Context;
import android.net.ConnectivityManager;

import com.directly.luckyboard.app.DirectlyApplication;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/8 10:05
 */

public class CommonUtils {

    /**
     * 网路链接是否正常
     *
     * @return true or false
     */
    public static boolean isNetworkConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) DirectlyApplication.getInstance().getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        assert connectivityManager != null;
        return connectivityManager.getActiveNetworkInfo() != null;

    }
}
