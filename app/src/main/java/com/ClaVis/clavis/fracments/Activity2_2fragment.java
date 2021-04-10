package com.ClaVis.clavis;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ClaVis.clavis.adpters.RecyclerViewAdapter;


public class Activity2_2fragment extends Fragment {
    private RecyclerView recyclerView1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_activity2_2fragment, container, false);
        recyclerView1 = v.findViewById(R.id.rv);
        recyclerView1.setAdapter(new RecyclerViewAdapter(getActivity()));

        return v;
    }

    public static Activity2_2fragment getInstance(String s){
        Activity2_2fragment fragment = new Activity2_2fragment();
        Bundle bundle = new Bundle();
        bundle.putString(MainActivity.MSG_NAME, s);
        fragment.setArguments(bundle);
        return fragment;
    }

}