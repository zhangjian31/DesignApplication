package com.example.zhangjian.designapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by zhangjian on 2017/7/22.
 */

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    String[] titles;
    Fragment[] fragments;


    public FragmentPagerAdapter(FragmentManager managers,String[] titles, Fragment[] fragments) {
        super(managers);
        this.titles = titles;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
