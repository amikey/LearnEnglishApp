package com.example.englishquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class videoMenu extends AppCompatActivity {


    public Button but6;
    public Button but2;
    public Button but3;
    public Button but5;
    int typeOfVideo;

    public void init() {

        but2 = (Button) findViewById(R.id.activitiesVideo);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfVideo = 3;
                Intent toy = new Intent(videoMenu.this,PlayVideo.class);
                toy.putExtra("the_video", typeOfVideo);
                startActivity(toy);
            }
        });
        but3 = (Button) findViewById(R.id.peoplearoundusVideo);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfVideo = 2;
                Intent toy = new Intent(videoMenu.this,PlayVideo.class);
                toy.putExtra("the_video", typeOfVideo);
                startActivity(toy);
            }
        });

        but5 = (Button) findViewById(R.id.numbersVideo);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfVideo = 0;
                Intent toy = new Intent(videoMenu.this,PlayVideo.class);
                toy.putExtra("the_video", typeOfVideo);
                startActivity(toy);
            }
        });
        but6 = (Button) findViewById(R.id.dayandmonthscategoryVideo);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfVideo = 1;
                Intent toy = new Intent(videoMenu.this,PlayVideo.class);
                toy.putExtra("the_video", typeOfVideo);
                startActivity(toy);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_menu);
        init();
    }

    @Override
    public void onBackPressed() {
        finish();
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}
