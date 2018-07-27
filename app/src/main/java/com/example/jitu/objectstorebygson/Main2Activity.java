package com.example.jitu.objectstorebygson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        String answersession = MySharedPreference.readString(getApplicationContext(), "answersession", "useridsset", "novaluesaved");

        java.lang.reflect.Type type1 = new TypeToken<ArrayList<ModelOfArea>>() {
        }.getType();
        Gson gson = new Gson();
        ArrayList<ModelOfArea> testHashMap2 = gson.fromJson(answersession, type1);

        System.out.println("testHashMap2: "+testHashMap2);
        System.out.println(testHashMap2.get(0).areaName);


    }
}
