package com.manoj.subreddit_demo.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.manoj.subreddit_demo.db.entity.Bookmarks;

import java.util.List;

@Dao
public interface BookmarkDAO {

    @Insert
    public long addBookmark(Bookmarks bookmarks);

    @Query("select * from bookmarks")
    public List<Bookmarks> getallBookmarks();

    @Query("select * from bookmarks where bookamrk_name ==:bookmarkname")
    public Bookmarks getBookmark(long bookmarkname);

    @Query("select * from bookmarks where bookamrk_name ==:bookmarkname")
    public Bookmarks getBookmarkbyName(String bookmarkname);
}
