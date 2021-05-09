package com.ClaVis.clavis.adpters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.ClaVis.clavis.MainActivity;
import com.ClaVis.clavis.R;

public class ElementsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private final LayoutInflater inflater;
    private final Fragment fragment;
    private final Integer[] id;
    private final String[] name;
    private final Bundle bundle;


    public ElementsAdapter(Context context, Fragment fragment, Bundle bundle) {
        id = new Integer[]{R.id.pianoFragment, R.id.info_Fragment};
        name = new String[]{"Практика", "Теория"};
        this.fragment = fragment;
        this.bundle = bundle;

        inflater = LayoutInflater.from(context);


    }

    private final class MyHolder extends RecyclerView.ViewHolder{

        private final TextView textView;
        protected final View view;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            textView = itemView.findViewById(R.id.tv_item);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);

        return new MyHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MyHolder) holder).textView.setText(name[position]);
        ((MyHolder) holder).  view.setOnClickListener((view) ->{


            NavHostFragment.findNavController(fragment)
                    .navigate(id[position], bundle);
        });
    }

    @Override
    public int getItemCount() {
        return id.length;
    }
}
