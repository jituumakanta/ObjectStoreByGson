package com.example.jitu.objectstorebygson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ModelOfArea> objectofAreaArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ModelOfArea modelOfArea1 = new ModelOfArea();
        modelOfArea1.setAreaName("delhi");
        modelOfArea1.setLatitude(28.7041);
        modelOfArea1.setLongitude(77.1025);

        ModelOfArea modelOfArea2 = new ModelOfArea();
        modelOfArea2.setAreaName("kolkota");
        modelOfArea2.setLatitude(22.5726);
        modelOfArea2.setLongitude(88.3639);

        ModelOfArea modelOfArea3 = new ModelOfArea();
        modelOfArea3.setAreaName("bengaluru");
        modelOfArea3.setLatitude(12.9716);
        modelOfArea3.setLongitude(77.5946);

        ModelOfArea modelOfArea4 = new ModelOfArea();
        modelOfArea4.setAreaName("mumbai");
        modelOfArea4.setLatitude(19.0760);
        modelOfArea4.setLongitude(72.8777);

        objectofAreaArrayList.add(modelOfArea1);
        objectofAreaArrayList.add(modelOfArea2);
        objectofAreaArrayList.add(modelOfArea3);
        objectofAreaArrayList.add(modelOfArea4);



        Gson gson2 = new Gson();
        String useridsset1 = gson2.toJson(objectofAreaArrayList);
        MySharedPreference.writeString(this, "answersession", "useridsset", useridsset1);
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
}
