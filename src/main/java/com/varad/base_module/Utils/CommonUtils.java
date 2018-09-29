package com.varad.base_module.Utils;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by varad on 29/09/18.
 */
public class CommonUtils {

    private static final String TAG = CommonUtils.class.getSimpleName();

    public static ProgressDialog showProgressDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.show();
        progressDialog.setIndeterminate(true);

        return progressDialog;
    }
}
