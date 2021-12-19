package com.example.digitalni_atlas.ui.uzemiModel.kacina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.digitalni_atlas.R;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.FragmentAdapter_cvp;
import com.google.android.material.tabs.TabLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.Objects;

public class kachActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentAdapter_kach adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kach);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout = findViewById(R.id.tab_layout);
        pager2 = findViewById(R.id.view_pager2);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.head)));
        getSupportActionBar().setTitle("Kačina");


        FragmentManager fm = getSupportFragmentManager();
        adapter = new FragmentAdapter_kach(fm, getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_home_24));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_photo_24));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_videocam_24));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_map_24));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}