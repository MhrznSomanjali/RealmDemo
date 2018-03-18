package com.example.somanjali.realmdemo.realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by somanjali on 3/16/18.
 */

public class MyPojo extends RealmObject {
    @PrimaryKey
    private Integer id;

    private String name;

    private Integer rollNo;

    public MyPojo(){

    }

    public MyPojo( String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
