package com.varad.base_module;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.varad.base_module.Utils.CommonUtils;

public class BaseActivity extends AppCompatActivity implements BaseView {

    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_base);
    }


    @Override
    public void showLoading() {
        hideLoading();
        mProgressDialog = CommonUtils.showProgressDialog(this);
    }

    @Override
    public void hideLoading() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.cancel();
        }
    }
}
