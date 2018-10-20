package com.example.clgp.zeigeuhrzeit;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.*;


public class Activity1 extends AppCompatActivity {

    private Button button;

    String pattern = "HH:mm:ss";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(new Date());



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        button= findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("date", date);
        startActivity(intent);
    }
}