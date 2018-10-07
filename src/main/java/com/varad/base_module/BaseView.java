package com.varad.base_module;

import android.support.annotation.StringRes;

/**
 * Created by varad on 29/09/18.
 */
public interface BaseView {

    boolean isConnectToInternet();

    void showLoading();

    void hideLoading();

    void onError(String errorMessage);

    void onError(@StringRes int resId);

    void showShortToastMessage(String message);

    void showShortToastMessage(@StringRes int resId);

    void showLongToastMessage(String message);

    void showLongToastMessage(@StringRes int resId);
}
