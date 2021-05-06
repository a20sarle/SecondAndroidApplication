package com.example.secondandroidapplication;

import android.media.Image;

public class Auxdata {

    private String wiki;
    private String img;

    public Auxdata(String _img, String _wiki) {
        img=_img;
        wiki=_wiki;
    }

    public String getWiki() {
        return wiki;
    }

    public String getImg() {
        return img;
    }
}
