package com.example.digitalni_atlas.ui.uzemiModel.mostecko;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.digitalni_atlas.ui.uzemiModel.kutnohorsko.fourFragment_kut;
import com.example.digitalni_atlas.ui.uzemiModel.kutnohorsko.oneFragment_kut;
import com.example.digitalni_atlas.ui.uzemiModel.kutnohorsko.threeFragment_kut;
import com.example.digitalni_atlas.ui.uzemiModel.kutnohorsko.twoFragment_kut;

public class FragmentAdapter_most extends FragmentStateAdapter {
    public FragmentAdapter_most(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_most();
            case 2:
                return new threeFragment_most();
            case 3:
                return new fourFragment_most();
        }

        return new oneFragment_most();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
