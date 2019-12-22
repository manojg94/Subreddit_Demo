package com.manoj.subreddit_demo;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.manoj.subreddit_demo.Adapter.PaginationListener;
import com.manoj.subreddit_demo.Adapter.recyclerAdapter;
import com.manoj.subreddit_demo.Adapter.recyclerModel;
import com.manoj.subreddit_demo.Adapter.recyclerViewAdapter;
import com.manoj.subreddit_demo.api.api;
import com.manoj.subreddit_demo.api.pojo.MainControl;
import com.manoj.subreddit_demo.db.BookMarkAppDatabase;
import com.manoj.subreddit_demo.db.entity.Bookmarks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.manoj.subreddit_demo.Adapter.PaginationListener.PAGE_START;

public class MainActivity extends AppCompatActivity implements recyclerAdapter {
    public List<recyclerModel> recyclerModels=new ArrayList<>();
    public recyclerViewAdapter adapter;
    RecyclerView recyclerView;

    SwipeRefreshLayout swipeRefresh;
    private int currentPage = PAGE_START;
    private int currentPagecount = 1;
    private boolean isLastPage = false;
    private int totalPage = 10;
    private boolean isLoading = false;
    int itemCount = 0;
    private BookMarkAppDatabase bookMarkAppDatabase;
    private ArrayList<Bookmarks> bookmarksArrayList=new ArrayList<>();
    public Boolean bookmarked=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.my_recycler_view);
        bookMarkAppDatabase= Room.databaseBuilder(getApplicationContext(),
                BookMarkAppDatabase.class,"bookmarkDB").build();

        // .setLayoutManager is important or else the recycler view will show empty
        adapter=new recyclerViewAdapter(recyclerModels,MainActivity.this);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

        movielistList(currentPage);

        recyclerView.addOnScrollListener(new PaginationListener(mLayoutManager) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                currentPagecount++;
                currentPage=currentPage+totalPage;
                movielistList(currentPage);
                Toast.makeText(MainActivity.this, "Loading page "+currentPagecount, Toast.LENGTH_SHORT).show();
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_bookmark:
                Intent intent = new Intent(MainActivity.this,BookmarksActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void movielistList(int pagenumber) {
//        progressbar = ProgressDialog.show(MainActivity.this, "",
//                "Loading  Please wait...", true);
        Retrofit retro = new Retrofit.Builder()
                .baseUrl(api.baseurl)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();
        api retrfit = retro.create(api.class);
        Call<MainControl> call;
            call = retrfit.getmovies(
                    pagenumber);


        call.enqueue(new Callback<MainControl>() {
            @Override
            public void onResponse(Call<MainControl> call, retrofit2.Response<MainControl> response) {

                if (response.isSuccessful()) {
                    recyclerModels.clear();
                    for (int i = 0; i < response.body().getData().getChildren().size(); i++) {
                        Toast.makeText(MainActivity.this, "SuccessFully ...", Toast.LENGTH_SHORT).show();
                        Log.d("results",response.body().getData().getChildren().get(i).
                                getData().getTitle());

                        recyclerModel datalist=new recyclerModel(
                                response.body().getData().getChildren().get(i).
                                        getData().getTitle(),
                                response.body().getData().getChildren().get(i).
                                        getData().getBannerImg(),
                                response.body().getData().getChildren().get(i).
                                        getData().getPublicDescription(),
                                response.body().getData().getChildren().get(i).
                                        getData().getName()

                        );
                        recyclerModels.add(datalist);
                    }
                    isLoading=false;
                    adapter.notifyDataSetChanged();

                } else {
                    isLoading=false;
                    Toast.makeText(MainActivity.this, "Failed ", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<MainControl> call, Throwable t) {
                Log.d("errorin:",t.getMessage());
                isLoading=false;
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }

        });
    }

    @Override
    public void onitemclick(View view, int pos) {
       // Toast.makeText(this, recyclerModels.get(pos).getTitle(), Toast.LENGTH_SHORT).show();
         String title=recyclerModels.get(pos).getTitle();
         String poster=recyclerModels.get(pos).getPoster();
         String descp=recyclerModels.get(pos).getDescp();
         String name=recyclerModels.get(pos).getName();

         createBookmark(title,poster,descp,name);
    }

    private void createBookmark(String title, String poster, String descp, String name) {
        new createBookmarkAsyncTask().execute(new Bookmarks(title,poster,descp,name));

    }



    public class createBookmarkAsyncTask extends AsyncTask<Bookmarks,Void,Void> {

        @Override
        protected Void doInBackground(Bookmarks... bookmarks) {
//            long id = bookMarkAppDatabase.getbookmarkDAO().addBookmark(bookmarks[0]);
//            Bookmarks bookmarks1 =  bookMarkAppDatabase.getbookmarkDAO().getBookmark(id);
//
//            if (bookmarks1 != null) {
//
//                bookmarksArrayList.add(0, bookmarks1);
//
//            }

            Bookmarks checkdatapresent =  bookMarkAppDatabase.getbookmarkDAO().getBookmarkbyName(bookmarks[0].getName());
            if (checkdatapresent==null){
                bookmarked=true;
                long id = bookMarkAppDatabase.getbookmarkDAO().addBookmark(bookmarks[0]);
                Bookmarks bookmarks1 =  bookMarkAppDatabase.getbookmarkDAO().getBookmark(id);

                if (bookmarks1 != null) {
                    bookmarksArrayList.add(0, bookmarks1);
                }
            }else {
                bookmarked=false;
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            adapter.notifyDataSetChanged();
            if (bookmarked){
                Toast.makeText(MainActivity.this, "Bookmarked Successfully..", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Already Bookmarked..", Toast.LENGTH_SHORT).show();

            }

        }
    }
}
