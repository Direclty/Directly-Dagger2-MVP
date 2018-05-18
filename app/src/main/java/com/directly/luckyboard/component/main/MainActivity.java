package com.directly.luckyboard.component.main;

import com.directly.luckyboard.R;
import com.directly.luckyboard.base.activity.BaseActivity;
import javax.inject.Inject;

/**
 * @author Xiao-Long Zhou
 * @date 2018/04/26
 */
public class MainActivity extends BaseActivity<MainPresenter> {

    @Inject
    MainPresenter presenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInject() {
        getActivityAppComponent().inject(this);
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
    protected void initEventAndData() {
        presenter.loadLoginMessage("","");
    }

}
