package com.directly.luckyboard.core.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.directly.luckyboard.app.Constants;
import com.directly.luckyboard.app.DirectlyApplication;

import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/8 10:44
 */

public class PreferenceHelperImpl implements PreferenceHelper{
    private static final String MY_SHARED_PREFERENCE = "my_shared_preference";
    private final SharedPreferences mPreferences;

    @Inject
    PreferenceHelperImpl() {
        mPreferences = DirectlyApplication.getInstance().getSharedPreferences(MY_SHARED_PREFERENCE, Context.MODE_PRIVATE);
    }

    @Override
    public void setLoginAccount(String account) {
        mPreferences.edit().putString(Constants.ACCOUNT, account).apply();
    }

    @Override
    public void setLoginPassword(String password) {
        mPreferences.edit().putString(Constants.PASSWORD, password).apply();
    }

    @Override
    public String getLoginAccount() {
        return mPreferences.getString(Constants.ACCOUNT, "");
    }

    @Override
    public String getLoginPassword() {
        return mPreferences.getString(Constants.PASSWORD, "");
    }

    @Override
    public void setLoginStatus(boolean isLogin) {
        mPreferences.edit().putBoolean(Constants.LOGIN_STATUS, isLogin).apply();
    }

    @Override
    public boolean getLoginStatus() {
        return mPreferences.getBoolean(Constants.LOGIN_STATUS, false);
    }

    @Override
    public void setCookie(String domain, String cookie) {
        mPreferences.edit().putString(domain, cookie).apply();
    }

}
