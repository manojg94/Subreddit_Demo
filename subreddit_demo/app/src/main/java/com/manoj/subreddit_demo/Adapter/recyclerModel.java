package com.manoj.subreddit_demo.Adapter;

import androidx.room.Entity;

public class recyclerModel {

    private String title;
    private String poster;
    private String descp;
    private String name;

    public recyclerModel(String title, String poster, String descp, String name) {
        this.title = title;
        this.poster = poster;
        this.descp = descp;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
