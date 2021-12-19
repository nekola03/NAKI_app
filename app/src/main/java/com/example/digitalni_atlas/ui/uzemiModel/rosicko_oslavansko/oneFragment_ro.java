package com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.digitalni_atlas.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link oneFragment_ro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class oneFragment_ro extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public oneFragment_ro() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment oneFragment_ro.
     */
    // TODO: Rename and change types and number of parameters
    public static oneFragment_ro newInstance(String param1, String param2) {
        oneFragment_ro fragment = new oneFragment_ro();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one_ro, container, false);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/12_Zalesn%C4%9Bn%C3%A1%20halda%20b%C3%BDval%C3%A9ho%20%20dolu%20Anton%C3%ADn,%20typick%C3%BD%20antropogenn%C3%AD%20prvek%20reli%C3%A9fu%20Rosicka-Oslavanska.jpg").into(imageView);

        return view;
    }
}