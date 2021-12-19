package com.example.digitalni_atlas.ui.uzemiModel.stredni_povltavi;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko.fourFragment_ro;
import com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko.oneFragment_ro;
import com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko.threeFragment_ro;
import com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko.twoFragment_ro;

public class FragmentAdapter_sp extends FragmentStateAdapter {
    public FragmentAdapter_sp(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_sp();
            case 2:
                return new threeFragment_sp();
            case 3:
                return new fourFragment_sp();
        }

        return new oneFragment_sp();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
