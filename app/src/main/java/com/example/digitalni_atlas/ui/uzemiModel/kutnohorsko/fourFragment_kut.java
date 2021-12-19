package com.example.digitalni_atlas.ui.uzemiModel.kutnohorsko;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.digitalni_atlas.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fourFragment_kut#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fourFragment_kut extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fourFragment_kut() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fourFragment_kut.
     */
    // TODO: Rename and change types and number of parameters
    public static fourFragment_kut newInstance(String param1, String param2) {
        fourFragment_kut fragment = new fourFragment_kut();
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
        View view = inflater.inflate(R.layout.fragment_four_kut, container, false);

        Button butOpen = (Button) view.findViewById(R.id.butOpen);
        butOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),com.example.digitalni_atlas.activityGooglemap.class);
                startActivity(intent);
            }
        });

        return view;
    }
}