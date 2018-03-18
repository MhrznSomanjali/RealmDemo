package com.example.somanjali.realmdemo.realm;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.somanjali.realmdemo.R;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MyActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name;
    private EditText roll;
    private Button save;
    private TextView showlist;
    private String saveText,showlistText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        initviews();
        initListeners();

            }
            public void initviews(){
                name=findViewById(R.id.nameedit);
                roll=findViewById(R.id.rolledit);
                save=findViewById(R.id.save);
                showlist=findViewById(R.id.showlist);



            }

            public void initListeners(){
                save.setOnClickListener(this);
                showlist.setOnClickListener(this);

            }


    @Override
    public void onClick(View view) {
                saveText=save.getText().toString().trim();
                showlistText=showlist.getText().toString().trim();
        if (view == save) {

            mypojo myPoJo = new mypojo(1,saveText, showlistText);


            Realm realm = Realm.getDefaultInstance();
            realm.beginTransaction();

            realm.copyToRealmOrUpdate(myPoJo);


            realm.commitTransaction();
            realm.close();

            Toast.makeText(this,"Successful",Toast.LENGTH_SHORT).show();

        }
        if (view == showlist) {
            Intent intent=new Intent(MyActivity.this,ShowList.class);
            startActivity(intent);






        }
    }



    }

