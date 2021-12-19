package com.example.digitalni_atlas.ui.uzemiModel.krkonose;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.digitalni_atlas.ui.uzemiModel.kladensko.fourFragment_klad;
import com.example.digitalni_atlas.ui.uzemiModel.kladensko.oneFragment_klad;
import com.example.digitalni_atlas.ui.uzemiModel.kladensko.threeFragment_klad;
import com.example.digitalni_atlas.ui.uzemiModel.kladensko.twoFragment_klad;

public class FragmentAdapter_krk extends FragmentStateAdapter {
    public FragmentAdapter_krk(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_krk();
            case 2:
                return new threeFragment_krk();
            case 3:
                return new fourFragment_krk();
        }

        return new oneFragment_krk();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
