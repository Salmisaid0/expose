package com.salmi20015.vivlo;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class productAdapter extends RecyclerView.Adapter {

    public static class productViewHolder extends RecyclerView.ViewHolder{
        public productViewHolder(View itemView){
            super(itemView);
        }}
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;  //te3ayate lel item w tourebouteha me3a lholder
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       //hena chaque valeur habin nefawetouha lel item lzm tekoun metabe0a le wech habine mathalan image nefawetouha lel image view
    }

    @Override
    public int getItemCount() {
        return 0; //nombred de items in the recycleview
    }

    }

