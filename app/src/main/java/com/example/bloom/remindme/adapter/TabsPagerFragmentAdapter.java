package com.example.bloom.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.bloom.remindme.fragment.ExampleFragment;

/**
 * Created by Bloom on 23.02.2017.
 * для керування TabLayout в головному класі
 */

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab1",
                "Нагадування",
                "Tab2"
        };
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                /**Статичний метод*/
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
        }

        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
