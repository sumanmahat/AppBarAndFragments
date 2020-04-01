package com.example.actionbarpractise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private SectionPagerAdapter sectionPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);
        setUpViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_assignment);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_autorenew);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_attach_file);

    }

    private void setUpViewPager(ViewPager viewPager){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragemnt(new Fragment1());
        adapter.addFragemnt(new Fragment2());
        adapter.addFragemnt(new Fragment3());
        viewPager.setAdapter(adapter);
    }
}
