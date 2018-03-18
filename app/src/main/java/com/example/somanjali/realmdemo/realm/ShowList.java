package com.example.somanjali.realmdemo.realm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.example.somanjali.realmdemo.R;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class ShowList extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<mypojo> myPojoList;
    private Realm realm;
    private MyAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);

        initViews();
        initRecyclerView();
        initRealm();
    }

    public void initViews() {
        recyclerView=findViewById(R.id.rcvMy);
    }

    public void initRecyclerView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        myPojoList=new ArrayList<>();
        myadapter=new MyAdapter(myPojoList);
        recyclerView.setAdapter(myadapter);
    }
    public void initRealm(){
        realm = Realm.getDefaultInstance();

        RealmResults<mypojo> myPojoRealmResults = realm.where(mypojo.class).findAll();

        myPojoList = realm.copyFromRealm(myPojoRealmResults);

        realm.close();




    }
}
