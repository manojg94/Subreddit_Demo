package com.manoj.subreddit_demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.manoj.subreddit_demo.R;
import com.manoj.subreddit_demo.db.entity.Bookmarks;

import java.util.List;


public class BookmarkrecyclerViewAdapter extends RecyclerView.Adapter<BookmarkrecyclerViewAdapter.viewHolder>  {
    //model and interface
    public List<Bookmarks> recyclerModel;
    //step 1
    public BookmarkrecyclerViewAdapter(List<Bookmarks> recyclerModel) {
        this.recyclerModel=recyclerModel;
    }



    ////step 2
    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
       TextView names,ratingrate;
        ImageView image;
        Context context;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            //initializtions of the UI like textview etc

            context=itemView.getContext();
            names = itemView.findViewById(R.id.moviename);
            image = itemView.findViewById(R.id.image);
            ratingrate = itemView.findViewById(R.id.ratingrate);

        }

        @Override
        public void onClick(View view) {

         //  recyclerAdapter.onitemclick(view,getAdapterPosition());
        }
    }

    //below are the implementations of recycler view
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //create views here like layout initializtions only and retrurn the layout view
        //retrun viewholder with params as view and interface
        // .inflate 3rd parameter should be false
        final View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.datalist,viewGroup,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int i) {
        //here  binding the data to the UI like textview etc.

        viewHolder.names.setText(recyclerModel.get(i).getTitle());
        viewHolder.ratingrate.setText(String.valueOf(recyclerModel.get(i).getDescp()));
        Glide.with(viewHolder.context).load(recyclerModel.get(i).getPoster()).into(viewHolder.image);

    }




    @Override
    public int getItemCount() {
        return recyclerModel.size();
    }




}
