package com.example.zhangjian.designapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TabActivity extends AppCompatActivity {
    ViewPager viewpager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        String[] titles = new String[5];
        final Fragment[] fragments = new Fragment[5];
        for (int i = 0; i < 5; i++) {
            titles[i]="tab"+i;
            fragments[i]=TabFragment.newInstance(titles[i]);
            tabLayout.addTab(tabLayout.newTab().setText(titles[i]));
        }
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        FragmentPagerAdapter adapter= new FragmentPagerAdapter(getSupportFragmentManager(),titles,fragments);
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
        tabLayout.setTabsFromPagerAdapter(adapter);
    }
}
