package com.manoj.subreddit_demo.api.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private SpecificData data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public SpecificData getData() {
        return data;
    }

    public void setData(SpecificData data) {
        this.data = data;
    }
}
