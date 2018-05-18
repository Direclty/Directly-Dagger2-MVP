package com.directly.luckyboard.di.module;

import android.app.Activity;

import com.directly.luckyboard.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/16
 */

@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    Activity provideActivity() {
        return this.mActivity;
    }

}
