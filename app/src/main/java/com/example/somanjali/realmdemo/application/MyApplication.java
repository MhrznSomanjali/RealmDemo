package com.example.somanjali.realmdemo.application;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by somanjali on 3/16/18.
 */

public class MyApplication extends Application {


    public void onCreate() {
        super.onCreate();
        initRealm();
    }

    private void initRealm(){
        Realm.init(this);

        RealmConfiguration realmConfiguration=new RealmConfiguration.Builder().schemaVersion(1).name("helloworld").deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(realmConfiguration);

    }
}
