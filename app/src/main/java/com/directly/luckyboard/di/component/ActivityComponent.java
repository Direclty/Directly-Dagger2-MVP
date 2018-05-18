package com.directly.luckyboard.di.component;

import android.app.Activity;

import com.directly.luckyboard.component.login.LoginActivity;
import com.directly.luckyboard.component.main.MainActivity;
import com.directly.luckyboard.di.module.ActivityModule;
import com.directly.luckyboard.di.scope.ActivityScope;

import dagger.Component;


/**
 * @author Xiao-Long Zhou
 * @date 2018/5/16
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    /**
     * 获取Activity实例
     *
     * @return Activity
     */
    Activity getActivity();

    /**
     * 注入MAinActivity所需的依赖
     *
     * @param mainActivity MainActivity
     */
    void inject(MainActivity mainActivity);

    /**
     * 注入LoginActivity所需的依赖
     *
     * @param loginActivity LoginActivity
     */
    void inject(LoginActivity loginActivity);

}
