package com.varad.base_module.Utils;

import android.app.ProgressDialog;
import android.content.Context;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static boolean isEmailValid(String emailAddress) {

        final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern;

        pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailAddress);

        return matcher.matches();
    }
}
