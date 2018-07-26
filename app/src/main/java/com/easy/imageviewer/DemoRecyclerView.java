package com.easy.imageviewer;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DemoRecyclerView extends RecyclerView.Adapter<DemoRecyclerView.ItemViewHolder>
{
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlist_item_add_ons, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }


    class ItemViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener
    {
        private ItemViewHolder(View itemView)
        {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }


/*
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private ViewHolder(View itemView)
        {
            super(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v)
        {
            //clickListener.onItemClick(v, getAdapterPosition());
        }
    }*/
}
