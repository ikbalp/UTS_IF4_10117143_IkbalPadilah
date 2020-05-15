package com.ikbalp.introscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/*
     Minggu, 10 Mei 2020
     Ikbal Padilah
     10117143 - IF4
*/

/**
 * A simple {@link Fragment} subclass.
 */
public class FragHome extends Fragment {



    public FragHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
