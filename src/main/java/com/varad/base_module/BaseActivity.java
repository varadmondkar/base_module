package com.varad.base_module;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.varad.base_module.Utils.CommonUtils;

import butterknife.Unbinder;

public class BaseActivity extends AppCompatActivity implements BaseView {

    private Unbinder mUnbinder;

    private ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_base);
    }

    /**
     * Seting up Butterknife view binder
     *
     * @param unBinder
     */
    public void setUnBinder(Unbinder unBinder) {
        mUnbinder = unBinder;
    }

    /**
     * Requesting for required app permission
     *
     * @param permissions
     * @param requestCode
     */
    public void requestPermissionSafely(String[] permissions, int requestCode) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions, requestCode);
        }
    }

    /**
     * Check whether app have required permission or not
     *
     * @param permission
     * @return
     */
    @TargetApi(Build.VERSION_CODES.M)
    public boolean hasPermission(String permission) {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M ||
                checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    }

    /**
     * Showing Progress Dialog loader
     */
    @Override
    public void showLoading() {
        hideLoading();
        mProgressDialog = CommonUtils.showProgressDialog(this);
    }

    /**
     * Hide Progress Dialog loader
     */
    @Override
    public void hideLoading() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.cancel();
        }
    }

    public void showSnackBar(String message) {
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                message, Snackbar.LENGTH_SHORT);
        View sbView = snackbar.getView();
        TextView textView = sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(ContextCompat.getColor(this, android.R.color.white));
        snackbar.show();
    }

}
