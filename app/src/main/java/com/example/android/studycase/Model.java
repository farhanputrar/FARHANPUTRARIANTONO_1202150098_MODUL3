package com.example.android.studycase;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.widget.ImageView;

/**
 * Created by user on 25/02/2018.
 */

public class Model {
    private String Judul;
    private String Info;
    private int Picture;

    static final String TITLE_KEY = "Judul";
    static final String IMAGE_KEY = "Picture Resource";


    private Model(String Judul, String Info, int Picture) {
        this.Judul = Judul;
        this.Info = Info;
        this.Picture = Picture;
    }

    public int getImage() {
        return Picture;
    }

    public String getInfo() {
        return Info;
    }

    public String getTitle() {
        return Judul;
    }

    public static Intent starter(Context context, String title, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, Detail.class);
        detailIntent.putExtra(TITLE_KEY,title);
        detailIntent.putExtra(IMAGE_KEY,imageResId);
        return detailIntent;
    }
}
