package com.ikbalp.introscreen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/*
     Selasa, 12 Mei 2020
     Ikbal Padilah
     10117143 - IF4
*/

/**
 * A simple {@link Fragment} subclass.
 */
public class FragDailyAct extends Fragment {

    RecyclerView recyclerView;
    RVAdapterDailyAct rvAdapterDailyAct;


    String s1[], s2[];
    int images[] = {R.drawable.da1,R.drawable.da2,R.drawable.da3,R.drawable.da4, R.drawable.da1,R.drawable.da6};




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_dailyact, container, false);

        recyclerView=view.findViewById(R.id.recycleviewDailyact);


        s1 = getResources().getStringArray(R.array.listdailyact);
        s2 = getResources().getStringArray(R.array.desc_listdailyact);

        rvAdapterDailyAct = new RVAdapterDailyAct(getActivity(), s1, s2, images);
        recyclerView.setAdapter(rvAdapterDailyAct);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;

    }
}