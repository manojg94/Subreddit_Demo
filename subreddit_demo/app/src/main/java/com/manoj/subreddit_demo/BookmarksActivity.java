package com.manoj.subreddit_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.manoj.subreddit_demo.Adapter.BookmarkrecyclerViewAdapter;
import com.manoj.subreddit_demo.db.BookMarkAppDatabase;
import com.manoj.subreddit_demo.db.entity.Bookmarks;

import java.util.ArrayList;

public class BookmarksActivity extends AppCompatActivity {
    private BookMarkAppDatabase bookMarkAppDatabase;
    private ArrayList<Bookmarks> bookmarksArrayList=new ArrayList<>();
    public BookmarkrecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmarks);
        recyclerView=findViewById(R.id.my_recycler_view);
        bookMarkAppDatabase= Room.databaseBuilder(getApplicationContext(),
                BookMarkAppDatabase.class,"bookmarkDB").build();
        adapter=new BookmarkrecyclerViewAdapter(bookmarksArrayList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        new getAllBookmarkssAsyncTask().execute();

    }


    public class getAllBookmarkssAsyncTask extends AsyncTask<Bookmarks,Void,Void> {

        @Override
        protected Void doInBackground(Bookmarks... bookmarks) {
            bookmarksArrayList.addAll(bookMarkAppDatabase.getbookmarkDAO().getallBookmarks());
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            adapter.notifyDataSetChanged();

            for (int i=0;i<bookmarksArrayList.size();i++){
                Log.d("allbookmarks",bookmarksArrayList.get(i).getTitle().toString());

            }
        }
    }
}
