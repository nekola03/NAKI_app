package com.example.digitalni_atlas.ui.uzemiModel.boletice;

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
 * Use the {@link twoFragment_bol#newInstance} factory method to
 * create an instance of this fragment.
 */
public class twoFragment_bol extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public twoFragment_bol() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment twoFragment_bol.
     */
    // TODO: Rename and change types and number of parameters
    public static twoFragment_bol newInstance(String param1, String param2) {
        twoFragment_bol fragment = new twoFragment_bol();
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
        View view = inflater.inflate(R.layout.fragment_two_bol, container, false);

        ImageView imageView1 = (ImageView)view.findViewById(R.id.imageView1);
        Glide.with(this).load("http://www.zaniklekrajiny.cz/atlas/images/phocagallery/Boletice%20-%20aktualni%20foto/thumbs/phoca_thumb_l_DSC_5800.jpg").into(imageView1);

        ImageView imageView2 = (ImageView)view.findViewById(R.id.imageView2);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Boletice%20-%20aktualni%20foto/DSC_5891.jpg").into(imageView2);

        ImageView imageView3 = (ImageView)view.findViewById(R.id.imageView3);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Boletice%20-%20aktualni%20foto/DSC_5912.JPG").into(imageView3);

        ImageView imageView4 = (ImageView)view.findViewById(R.id.imageView4);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Boletice%20-%20aktualni%20foto/DSC_5945.jpg").into(imageView4);

        ImageView imageView5 = (ImageView)view.findViewById(R.id.imageView5);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Boletice%20-%20aktualni%20foto/DSC_6003.jpg").into(imageView5);

        ImageView imageView6 = (ImageView)view.findViewById(R.id.imageView6);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Boletice%20-%20aktualni%20foto/DSC_6018.jpg").into(imageView6);

        ImageView imageView7 = (ImageView)view.findViewById(R.id.imageView7);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Boletice%20-%20aktualni%20foto/DSC_6061.jpg").into(imageView7);

        ImageView imageView8 = (ImageView)view.findViewById(R.id.imageView8);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Boletice%20-%20aktualni%20foto/DSC_6129.jpg").into(imageView8);

        return view;


    }
}