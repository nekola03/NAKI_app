package com.example.digitalni_atlas.ui.uzemiModel.kladensko;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.fourFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.oneFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.threeFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.twoFragment_cvp;

public class FragmentAdapter_klad extends FragmentStateAdapter {
    public FragmentAdapter_klad(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_klad();
            case 2:
                return new threeFragment_klad();
            case 3:
                return new fourFragment_klad();
        }

        return new oneFragment_klad();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
