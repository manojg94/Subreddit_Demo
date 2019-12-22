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

import java.util.List;



public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.viewHolder>  {
    //model and interface
    public List<recyclerModel> recyclerModel;
    public recyclerAdapter recyclerAdapter;
    //step 1
    public recyclerViewAdapter(List<recyclerModel> recyclerModel,
                               recyclerAdapter recyclerAdapter) {
        this.recyclerAdapter=recyclerAdapter;
        this.recyclerModel=recyclerModel;
    }



    ////step 2
    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public recyclerAdapter recyclerAdapter;

        TextView names,ratingrate;
        ImageView image,bookmark;
        Context context;
        public viewHolder(@NonNull View itemView, recyclerAdapter recyclerAdapter) {
            super(itemView);
            this.recyclerAdapter=recyclerAdapter;
            itemView.setOnClickListener(this);
            context=itemView.getContext();
            names = itemView.findViewById(R.id.moviename);
            image = itemView.findViewById(R.id.image);
            bookmark = itemView.findViewById(R.id.bookmark);
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

        final View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.datalist,viewGroup,false);

        return new viewHolder(view,recyclerAdapter);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int i) {
        //here  binding the data to the UI like textview etc.

        viewHolder.names.setText(recyclerModel.get(i).getTitle());
        viewHolder.ratingrate.setText(String.valueOf(recyclerModel.get(i).getDescp()));
        Glide.with(viewHolder.context).load(recyclerModel.get(i).getPoster()).into(viewHolder.image);

        viewHolder.bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerAdapter.onitemclick(v,i);

            }
        });
    }




    @Override
    public int getItemCount() {
        return recyclerModel.size();
    }




}
