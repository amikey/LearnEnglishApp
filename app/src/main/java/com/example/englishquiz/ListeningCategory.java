package com.example.englishquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListeningCategory extends AppCompatActivity {


    public Button but6;
    public Button but1;
    public Button but2;
    public Button but3;
    public Button but4;
    public Button but5;

    public void init() {
        but1 = (Button) findViewById(R.id.animal);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(ListeningCategory.this,AnimalActivity.class);
                startActivity(toy);
            }
        });
        but2 = (Button) findViewById(R.id.activities);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(ListeningCategory.this,ActivityActivity.class);
                startActivity(toy);
            }
        });
        but3 = (Button) findViewById(R.id.peoplearoundus);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(ListeningCategory.this,PeopleAroundUsActivity.class);
                startActivity(toy);
            }
        });
        but4 = (Button) findViewById(R.id.times);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(ListeningCategory.this,TimesActivity.class);
                startActivity(toy);
            }
        });
        but5 = (Button) findViewById(R.id.numbers);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(ListeningCategory.this,NumberActivity.class);
                startActivity(toy);
            }
        });
        but6 = (Button) findViewById(R.id.dayandmonthscategory);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(ListeningCategory.this,DayandMonthActivity.class);
                startActivity(toy);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);
        init();
    }

   @Override
    public void onBackPressed() {
        finish();
       Intent intent = new Intent(this, home.class);
       startActivity(intent);
    }
}
