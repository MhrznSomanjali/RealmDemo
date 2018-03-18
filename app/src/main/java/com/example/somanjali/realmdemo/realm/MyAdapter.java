package com.example.somanjali.realmdemo.realm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.somanjali.realmdemo.R;

import java.util.List;

/**
 * Created by somanjali on 3/17/18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<mypojo> Mynamelist;

    public MyAdapter(List<mypojo> Mylist){
        Mynamelist=Mylist;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_myrecycler_view,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        mypojo myPojo=Mynamelist.get(position);

        holder.name.setText(myPojo.getName());
        holder.roll.setText(myPojo.getRollNo());

    }

    @Override
    public int getItemCount() {
        return Mynamelist.size();
    }
}
