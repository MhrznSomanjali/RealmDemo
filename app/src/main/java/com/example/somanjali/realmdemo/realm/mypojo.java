package com.example.somanjali.realmdemo.realm;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by somanjali on 3/17/18.
 */

public class mypojo extends RealmObject {
    @PrimaryKey
    private Integer id;

    private String name;

    private String rollNo;

    public mypojo( String name, String rollNo) {
        //this.id = id;

        this.name = name;
        this.rollNo = rollNo;
    }

    public mypojo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
