package com.manoj.subreddit_demo.api;


import com.manoj.subreddit_demo.api.pojo.MainControl;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface api {
    String baseurl = "https://www.reddit.com/subreddits/";
    //String imageurl = "https://image.tmdb.org/t/p/w200";
   // String imageurl ="https://image.tmdb.org/t/p/original";

    @GET("popular.json")
    Call<MainControl> getmovies(
            @Query("limit") int page
    );
}
