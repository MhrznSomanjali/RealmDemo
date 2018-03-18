package com.example.somanjali.realmdemo.realm;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.somanjali.realmdemo.R;

import com.example.somanjali.realmdemo.R.*;

/**
 * Created by somanjali on 3/17/18.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    protected TextView name,roll;

    public MyViewHolder(View itemView) {
        super(itemView);

        initViews();
    }

    public void initViews(){
        name=itemView.findViewById(R.id.nametxt);
        roll=itemView.findViewById(R.id.rolltxt);
    }
}
