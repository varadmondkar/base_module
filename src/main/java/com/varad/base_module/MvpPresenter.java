package com.varad.base_module;

import com.varad.base_module.BaseView;

/**
 * Created by varad on 07/10/18.
 */
public interface MvpPresenter<V extends BaseView> {

    void onAttach(V baseView);

    void onDetach();

//    void handleApiError(ANError error);

//    void setUserAsLoggedOut();
}
