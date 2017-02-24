package com.example.bloom.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bloom.remindme.R;

/**
 * Created by Bloom on 23.02.2017.
 * фрагменти для TabsFragmentAdapter
 */

public class BirthdayFragment extends AbstractTabFragment{
    private static final int LAYOUT = R.layout.fragment_example;

    public static BirthdayFragment getInstance(Context context) {

        /**для обміну інформацією всіх типів між різними Activity*/
        Bundle args = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(args);

        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /**LayoutInflater дозволяє створити View елемент із XML файлу*/
        view = inflater.inflate(LAYOUT, container,false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
