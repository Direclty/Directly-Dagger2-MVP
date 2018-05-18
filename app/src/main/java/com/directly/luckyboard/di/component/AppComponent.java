package com.directly.luckyboard.di.component;


import com.directly.luckyboard.app.DirectlyApplication;
import com.directly.luckyboard.core.DataManager;
import com.directly.luckyboard.di.module.AppModule;
import com.directly.luckyboard.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/16
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    /**
     * 提供App的Context
     *
     * @return GeeksApp context
     */
    DirectlyApplication getContext();

    /**
     * 数据中心
     *
     * @return DataManager
     */
    DataManager getDataManager();

}
