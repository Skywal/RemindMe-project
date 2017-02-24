package com.example.bloom.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.bloom.remindme.R;
import com.example.bloom.remindme.fragment.AbstractTabFragment;
import com.example.bloom.remindme.fragment.BirthdayFragment;
import com.example.bloom.remindme.fragment.HistoryFragment;
import com.example.bloom.remindme.fragment.IdeasFragment;
import com.example.bloom.remindme.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bloom on 23.02.2017.
 * для керування TabLayout в головному класі
 */

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

        initTabsMap(context);
    }

    @Override
    public Fragment getItem(int position) {

        return tabs.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context){

        tabs = new HashMap<>();

        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));

    }
}
