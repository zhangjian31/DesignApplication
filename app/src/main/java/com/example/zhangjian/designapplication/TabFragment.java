package com.example.zhangjian.designapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TabFragment extends Fragment {


    private String mTitle;
    private View rootview;

    public TabFragment() {
    }

    public TabFragment(String title) {
        this.mTitle = title;
    }


    public static TabFragment newInstance(String title) {
        TabFragment fragment = new TabFragment(title);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_tab, container, false);
        TextView tv = rootview.findViewById(R.id.tv);
        tv.setText(mTitle);
        return rootview;
    }


}
