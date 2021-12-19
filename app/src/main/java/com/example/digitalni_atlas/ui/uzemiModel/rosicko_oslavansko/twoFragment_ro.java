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
 * Use the {@link twoFragment_ro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class twoFragment_ro extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public twoFragment_ro() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment twoFragment_ro.
     */
    // TODO: Rename and change types and number of parameters
    public static twoFragment_ro newInstance(String param1, String param2) {
        twoFragment_ro fragment = new twoFragment_ro();
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
        View view = inflater.inflate(R.layout.fragment_two_ro, container, false);

        ImageView imageView1 = (ImageView)view.findViewById(R.id.imageView1);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Stredni%20Povltavi%20-%20aktualni%20foto/DSC_4781.JPGhttp://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/01_Zem%C4%9Bd%C4%9Blsk%C3%A1%20krajina%20Boskovick%C3%A9%20br%C3%A1zdy,%20v%20pozad%C3%AD%20m%C4%9Bste%C4%8Dko%20Zast%C3%A1vka%20a%20zalesn%C4%9Bn%C3%BD%20okrajov%C3%BD%20svah%20%C4%8Ceskomoravsk%C3%A9%20vrchoviny.jpg").into(imageView1);

        ImageView imageView2 = (ImageView)view.findViewById(R.id.imageView2);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/03_Zem%C4%9Bd%C4%9Blsk%C3%A1%20krajina%20%20Oslavanska%20s%20haldou.jpg").into(imageView2);

        ImageView imageView3 = (ImageView)view.findViewById(R.id.imageView3);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/10_Zb%C3%BD%C5%A1ov%20-%20rodinn%C3%A9%20domy,%20pole%20a%20halda.jpg").into(imageView3);

        ImageView imageView4 = (ImageView)view.findViewById(R.id.imageView4);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/12_Zalesn%C4%9Bn%C3%A1%20halda%20b%C3%BDval%C3%A9ho%20%20dolu%20Anton%C3%ADn,%20typick%C3%BD%20antropogenn%C3%AD%20prvek%20reli%C3%A9fu%20Rosicka-Oslavanska.jpg").into(imageView4);

        ImageView imageView5 = (ImageView)view.findViewById(R.id.imageView5);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/13_%C5%98eka%20Oslava%20v%20Oslavanech.%20Ve%20svahu%20na%20lev%C3%A9m%20b%C5%99ehu%20jsou%20vstupy%20do%20star%C3%BDch%20%C5%A1tol..jpg").into(imageView5);

        ImageView imageView6 = (ImageView)view.findViewById(R.id.imageView6);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/14_Vstup%20do%20d%C4%9Bdi%C4%8Dn%C3%A9%20%C5%A1toly%20na%20b%C5%99ehu%20Oslavy%20v%20Oslavanech.jpg").into(imageView6);

        ImageView imageView7 = (ImageView)view.findViewById(R.id.imageView7);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/17_Z%C3%A1padn%C3%AD%20k%C5%99%C3%ADdlo%20z%C3%A1mku%20v%20Oslavanech,%20situovan%C3%A9ho%20v%20%C3%BAdoln%C3%AD%20niv%C4%9B%20Oslavy.jpg").into(imageView7);

        ImageView imageView8 = (ImageView)view.findViewById(R.id.imageView8);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/18_V%C3%BDchodn%C3%AD%20k%C5%99%C3%ADdlo%20a%20ark%C3%A1dy%20na%20rozlehl%C3%A9m%20%20n%C3%A1dvo%C5%99%C3%AD%20z%C3%A1mku%20v%20Oslavanech.jpg").into(imageView8);

        ImageView imageView9 = (ImageView)view.findViewById(R.id.imageView9);
        Glide.with(this).load("http://web.natur.cuni.cz/sekce-gr/zaniklekrajiny/atlas/images/phocagallery/Rosicko-Oslavansko%20-%20krajinn%C3%BD%20r%C3%A1z/19_Z%C3%A1bavn%C3%AD%20park%20Permonium%20na%20m%C3%ADst%C4%9B%20b%C3%BDval%C3%A9ho%20uheln%C3%A9ho%20dolu.jpg").into(imageView9);

        return view;
    }
}