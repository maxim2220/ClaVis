package com.ClaVis.clavis.fracments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ClaVis.clavis.MainActivity;
import com.ClaVis.clavis.R;
import com.ClaVis.clavis.adpters.ElementsAdapter;
import com.ClaVis.clavis.adpters.InfoAdapter;
import com.ClaVis.clavis.adpters.RecyclerViewAdapter;

public class PromeshtochniiFragment extends Fragment {
    private Integer[] id = {R.id.pianoFragment, R.id.info_Fragment};
    private RecyclerView recyclerView;
    private String[] name = {"Практика", "Теория"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_promeshtochnii, container, false);
        recyclerView = v.findViewById(R.id.rvpromesh);
        recyclerView.setAdapter(new ElementsAdapter(getActivity(), this, getArguments()));


        return v;
    }
}