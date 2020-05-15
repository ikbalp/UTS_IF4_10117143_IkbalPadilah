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
     Jumat, 15 Mei 2020
     Ikbal Padilah
     10117143 - IF4
*/

/**
 * A simple {@link Fragment} subclass.
 */
public class FragMusic extends Fragment {
    RecyclerView recyclerView;
    RVAdapterMusic rvAdapterMusic;


    String s1[], s2[];
    int images[] = {R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play, R.drawable.ic_play,R.drawable.ic_play,R.drawable.ic_play};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_music, container, false);
        recyclerView=view.findViewById(R.id.recycleviewMusic);

        s1 = getResources().getStringArray(R.array.listtitlemusic);
        s2 = getResources().getStringArray(R.array.listmusic);

        rvAdapterMusic = new RVAdapterMusic(getActivity(), s1, s2, images);
        recyclerView.setAdapter(rvAdapterMusic);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;

    }
}
