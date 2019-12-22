package com.manoj.subreddit_demo.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.manoj.subreddit_demo.db.entity.Bookmarks;

@Database(entities = {Bookmarks.class},version = 1)


public abstract class BookMarkAppDatabase extends RoomDatabase {

    public abstract BookmarkDAO getbookmarkDAO();
}
