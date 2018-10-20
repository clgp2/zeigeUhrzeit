package com.example.clgp.zeigeuhrzeit;

import android.app.Notification;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.clgp.zeigeuhrzeit.BaseApplication.CHANNEL_1_ID;

public class Activity2 extends AppCompatActivity {

    private NotificationManagerCompat notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        notificationManager = NotificationManagerCompat.from(this);


        }

    public void displayNotification(View v) {

       String content= getIntent().getExtras().getString("date");
       Notification notification = new NotificationCompat.Builder(this, CHANNEL_1_ID)
               .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("aktuelle Uhrzeit")
                .setContentText(content)
                .build();

                notificationManager.notify(1, notification);

    }


    }
