package com.example.somanjali.realmdemo.realm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.somanjali.realmdemo.R;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by somanjali on 3/16/18.
 */

public class RealmActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //copy
        MyPojo myPojo=new MyPojo("Somanjali",20);


        Realm realm=Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(myPojo);



        realm.commitTransaction();
        realm.close();
    }

    //get
    private void getMyPojo(){
        Realm realm=Realm.getDefaultInstance();
        RealmResults<MyPojo> myPojoList = realm.where(MyPojo.class).findAll();

        List<MyPojo> myList =realm.copyFromRealm(myPojoList);
        realm.close();


    }
}
