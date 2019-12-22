package com.manoj.subreddit_demo.db.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "bookmarks")

public class Bookmarks {
    @ColumnInfo(name = "bookamrk_title")
    private String title;

    @ColumnInfo(name = "bookamrk_poster")
    private String poster;

    @ColumnInfo(name = "bookamrk_descp")
    private String descp;

    @NonNull
    @ColumnInfo(name = "bookamrk_name")
    @PrimaryKey(autoGenerate = false)
    private String name;

    @Ignore
    public Bookmarks() {
    }

    public Bookmarks(String title, String poster, String descp, String name) {
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
