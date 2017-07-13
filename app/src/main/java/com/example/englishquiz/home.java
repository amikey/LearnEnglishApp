package com.example.englishquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton goToQuiz = (ImageButton) findViewById(R.id.quiz);
        goToQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick (View view){
              Intent intent1 = new Intent(home.this,QuizActivity.class );
                startActivity(intent1);
                finish();
            }
        });

        ImageButton goToListening = (ImageButton) findViewById(R.id.listening);
        goToListening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent2 = new Intent(home.this,ListeningCategory.class );
                startActivity(intent2);
                finish();
            }
        });

        ImageButton goToVideo = (ImageButton) findViewById(R.id.video);
        goToVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent3 = new Intent(home.this,videoMenu.class );
                startActivity(intent3);
                finish();
            }
        });

        ImageButton exitapps = (ImageButton) findViewById(R.id.exit);
        exitapps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                finish();
                System.exit(0);
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        finish();
    }
}
