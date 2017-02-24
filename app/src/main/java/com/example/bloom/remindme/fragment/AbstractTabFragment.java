package com.example.bloom.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Bloom on 24.02.2017.
 * клас від якого наслідуються фрагменти
 * для легкого доступу до title і відсутність копіпасти в фрагментах
 */

public class AbstractTabFragment extends Fragment {

    private String title;
    /**доступ до ресурсів*/
    protected Context context;
    protected View view;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
