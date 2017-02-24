package com.example.bloom.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bloom.remindme.R;
import com.example.bloom.remindme.adapter.RemindListAdapter;
import com.example.bloom.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bloom on 23.02.2017.
 * фрагменти для TabsFragmentAdapter
 */

public class HistoryFragment extends AbstractTabFragment{
    private static final int LAYOUT = R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context) {
        /**для обміну інформацією всіх типів між різними Activity*/
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);

        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /**LayoutInflater дозволяє створити View елемент із XML файлу*/
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RemindListAdapter(createMockListData()));

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    /**заглушка яка імітує дані що мають приходити із серверу*/
    private List<RemindDTO> createMockListData(){

        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        data.add(new RemindDTO("Item 5"));
        data.add(new RemindDTO("Item 6"));
        data.add(new RemindDTO("Item 7"));

        return data;
    }
}
