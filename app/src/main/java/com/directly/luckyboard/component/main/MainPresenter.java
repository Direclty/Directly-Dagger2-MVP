package com.directly.luckyboard.component.main;

import com.directly.luckyboard.base.presenter.BasePresenter;
import com.directly.luckyboard.component.login.LoginContract;
import com.directly.luckyboard.core.DataManager;

import javax.inject.Inject;


/**
 * @author quchao
 * @date 2017/11/28
 */

public class MainPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter, LoginContract.View {

    private DataManager dataManager;

    @Inject
    public MainPresenter(DataManager dataManager) {
        super(dataManager);
        this.dataManager = dataManager;
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public void attachView(LoginContract.View view) {
        super.attachView(view);
    }


    @Override
    public void loadLoginMessage(String name, String password) {

    }

    @Override
    public void requestLoginOutMessage(String uid) {

    }

    @Override
    public void registerView(String name, String password, String code) {

    }

    @Override
    public void start() {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showErrorView(boolean isShowT, boolean isShowView) {

    }

    @Override
    public void closeDialog() {

    }

    @Override
    public void loginView() {

    }

    @Override
    public void loginOutView() {

    }

    @Override
    public void registerView() {

    }
}

