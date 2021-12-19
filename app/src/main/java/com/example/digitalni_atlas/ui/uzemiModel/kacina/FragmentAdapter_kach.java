package com.example.digitalni_atlas.ui.uzemiModel.kacina;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.fourFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.oneFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.threeFragment_cvp;
import com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.twoFragment_cvp;

public class FragmentAdapter_kach extends FragmentStateAdapter {
    public FragmentAdapter_kach(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new twoFragment_kac();
            case 2:
                return new threeFragment_kac();
            case 3:
                return new fourFragment_kac();
        }

        return new oneFragment_kac();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
