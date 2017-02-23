package com.example.bloom.remindme.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bloom.remindme.R;

/**
 * Created by Bloom on 23.02.2017.
 * фрагменти для TabsPagerFragmentAdapter
 */

public class ExampleFragment extends Fragment{
    private static final int LAYOUT = R.layout.fragment_example;

    private View view;

    public static  ExampleFragment getInstance() {
        /**для обміну інформацією всіх типів між різними Activity*/
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /**LayoutInflater дозволяє створити View елемент із XML файлу*/
        view = inflater.inflate(LAYOUT, container,false);
        return view;
    }
}
