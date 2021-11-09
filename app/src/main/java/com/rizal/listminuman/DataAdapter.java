package com.rizal.listminuman;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    public DataAdapter (ArrayList<Data> listMinuman){
        this.listMinuman = listMinuman;
    }

    private ArrayList<Data> listMinuman;

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_minuman,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {
        Data data = listMinuman.get(position);
        holder.tvName.setText(data.getNama());
        holder.tvRating.setText("Rating "+data.getRating());
        holder.ivMinum.setImageResource(data.getId_image());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
//                Toast.makeText(holder.itemView.getContext(),data.getNama(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMinuman.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvName, tvRating;
        public ImageView ivMinum;
        public ConstraintLayout context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvRating = (TextView) itemView.findViewById(R.id.tvRating);
            ivMinum = (ImageView) itemView.findViewById(R.id.ivMinum);
            this.context = (ConstraintLayout) itemView.findViewById(R.id.itemLayout);
        }
    }
}
