package com.example.digitalni_atlas.ui.uzemiModel.jachymovsko; //přidat vše a přepsat pouze package a prepinani fragmentů

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.fourFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.oneFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.threeFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.twoFragment_cvp;

public class FragmentAdapter_jach extends FragmentStateAdapter {
    public FragmentAdapter_jach(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_jach();
            case 2:
                return new threeFragment_jach();
            case 3:
                return new fourFragment_jach();
        }

        return new oneFragment_jach();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
