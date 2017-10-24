package com.qizhu.qizhugoshshopping.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.qizhu.qizhugoshshopping.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Long° Engagement on 2017/10/18.
 * 第一个
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<String> imglist =new ArrayList<>();
    Context context;
    View view;

    public MyAdapter(List<String> imglist, Context context) {
        this.imglist = imglist;
        this.context = context;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(imglist.get(position)).into(holder.item_img);

    }

    @Override
    public int getItemCount() {
        return imglist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView item_img;
        public MyViewHolder(View itemView) {
            super(itemView);
            item_img = itemView.findViewById(R.id.item_img);

        }
    }
}
