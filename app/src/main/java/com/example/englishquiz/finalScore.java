package com.example.englishquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class finalScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);

        Bundle extras = getIntent().getExtras();
        int score_now = extras.getInt("my_score");
        TextView final_score = (TextView) findViewById(R.id.score);
        final_score.setText(""+score_now);


        ImageButton exitquiz = (ImageButton) findViewById(R.id.exitquiz);
        exitquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                finish();
                Intent intent = new Intent(finalScore.this, home.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}
