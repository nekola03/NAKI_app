package com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi; //přidat vše a přepsat pouze package a prepinani fragmentů

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter_cvp extends FragmentStateAdapter {
    public FragmentAdapter_cvp(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_cvp();
            case 2:
                return new threeFragment_cvp();
            case 3:
                return new fourFragment_cvp();
        }

        return new oneFragment_cvp();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
