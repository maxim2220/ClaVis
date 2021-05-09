package com.ClaVis.clavis.fracments;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ClaVis.clavis.R;


public class PianoFragment extends Fragment {
    private static ImageView imageView;


    public static void setImage(Context context){
        if (imageView != null){
            imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_doooskripich));
            Log.i("тег", "setImage: ");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_piano, container, false);
        imageView = v.findViewById(R.id.imv_nota);



        return v;
    }

}