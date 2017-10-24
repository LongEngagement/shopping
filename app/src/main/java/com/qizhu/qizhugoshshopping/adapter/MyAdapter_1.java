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
 * Created by Long° Engagement on 2017/10/20.
 */

public class MyAdapter_1 extends RecyclerView.Adapter<MyAdapter_1.MyViewHolder_1> {
    List<String> imglist_1 = new ArrayList<>();
    Context context;
    View view;

    public MyAdapter_1(List<String> imglist_1, Context context) {
        this.imglist_1 = imglist_1;
        this.context = context;
    }

    @Override
    public MyViewHolder_1 onCreateViewHolder(ViewGroup parent, int viewType) {
      view = LayoutInflater.from(context).inflate(R.layout.item_1,parent,false);
        MyViewHolder_1 viewHolder_1 = new MyViewHolder_1(view);
        return viewHolder_1;
    }

    @Override
    public void onBindViewHolder(MyViewHolder_1 holder, int position) {
        Glide.with(context).load(imglist_1.get(position)).into(holder.item_img_1);
    }

    @Override
    public int getItemCount() {
        return imglist_1.size();
    }

    public class MyViewHolder_1 extends RecyclerView.ViewHolder {
        ImageView item_img_1;
        public MyViewHolder_1(View itemView) {
            super(itemView);
            item_img_1 = itemView.findViewById(R.id.item_img_1);
        }
    }
}
