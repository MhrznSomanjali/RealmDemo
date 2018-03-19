package com.example.somanjali.realmdemo.realm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
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
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);

        initViews();
        initRecyclerView();
        initRealm();
        initToolbar();
    }

    public void initViews() {

        recyclerView = findViewById(R.id.rcvMy);
        toolbar=findViewById(R.id.toolBar);

    }

    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Showlist");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        myPojoList = new ArrayList<>();
        myadapter = new MyAdapter(myPojoList);
        recyclerView.setAdapter(myadapter);
    }

    public void initRealm() {
        realm = Realm.getDefaultInstance();

        RealmResults<mypojo> myPojoRealmResults = realm.where(mypojo.class).findAll();

        //myPojoList = realm.copyFromRealm(myPojoRealmResults);

        myPojoList.addAll(realm.copyFromRealm(myPojoRealmResults));

        realm.close();
        myadapter.notifyDataSetChanged();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            // android.id.home=default back
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
