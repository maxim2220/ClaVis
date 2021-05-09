package com.ClaVis.clavis.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.annotation.NonNull;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stats implements Serializable {
    private String name;
    private String info;
    private String photo;
    private Bitmap bitmap;
    private List<Stats> list;

    public Stats(String name, String info, String photo) {
        this.name = name;
        this.info = info;
        this.photo = photo;
    }

    public void setBitmap(InputStream stream) {
        this.bitmap = BitmapFactory.decodeStream(stream);
    }



    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getPhoto() {
        return photo;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public List<Stats> getList() {
        return list;
    }

    public void setList(List<Stats> list) {
        this.list = list;
    }
}
