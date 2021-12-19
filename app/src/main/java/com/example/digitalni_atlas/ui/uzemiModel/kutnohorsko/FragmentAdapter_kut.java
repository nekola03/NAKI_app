package com.example.digitalni_atlas.ui.uzemiModel.kutnohorsko;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.digitalni_atlas.ui.uzemiModel.kladensko.fourFragment_klad;
import com.example.digitalni_atlas.ui.uzemiModel.kladensko.oneFragment_klad;
import com.example.digitalni_atlas.ui.uzemiModel.kladensko.threeFragment_klad;
import com.example.digitalni_atlas.ui.uzemiModel.kladensko.twoFragment_klad;

public class FragmentAdapter_kut extends FragmentStateAdapter {
    public FragmentAdapter_kut(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_kut();
            case 2:
                return new threeFragment_kut();
            case 3:
                return new fourFragment_kut();
        }

        return new oneFragment_kut();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
