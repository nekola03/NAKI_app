package com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter_ro extends FragmentStateAdapter {
    public FragmentAdapter_ro(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_ro();
            case 2:
                return new threeFragment_ro();
            case 3:
                return new fourFragment_ro();
        }

        return new oneFragment_ro();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
