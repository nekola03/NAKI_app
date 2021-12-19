package com.example.digitalni_atlas.ui.uzemiModel.primestska_krajina_prahy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.digitalni_atlas.ui.uzemiModel.mostecko.fourFragment_most;
import com.example.digitalni_atlas.ui.uzemiModel.mostecko.oneFragment_most;
import com.example.digitalni_atlas.ui.uzemiModel.mostecko.threeFragment_most;
import com.example.digitalni_atlas.ui.uzemiModel.mostecko.twoFragment_most;

public class FragmentAdapter_pkp extends FragmentStateAdapter {
    public FragmentAdapter_pkp(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_pkp();
            case 2:
                return new threeFragment_pkp();
            case 3:
                return new fourFragment_pkp();
        }

        return new oneFragment_pkp();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
