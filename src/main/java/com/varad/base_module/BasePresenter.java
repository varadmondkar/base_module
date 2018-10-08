package com.varad.base_module;

/**
 * Created by varad on 08/10/18.
 */
public class BasePresenter<V extends BaseView> implements MvpPresenter<V> {

    private static final String TAG = BasePresenter.class.getSimpleName();

    private V mBaseView;

    @Override
    public void onAttach(V baseView) {
        mBaseView = baseView;
    }

    @Override
    public void onDetach() {
        mBaseView = null;
    }

    public V getBaseView() {
        return mBaseView;
    }

    public boolean isViewAttached() {
        return mBaseView != null;
    }
}
