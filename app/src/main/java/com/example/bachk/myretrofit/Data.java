package com.example.bachk.myretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bachk on 1/31/2018.
 */

public class Data {
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("link")
    @Expose
    private String link;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
