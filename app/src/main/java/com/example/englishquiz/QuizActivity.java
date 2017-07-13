package com.example.englishquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    String pilihan;
    int score=0;
    int questionNumber=0;

    private questionLibrary getQuestionLibrary = new questionLibrary();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateQuestion();

        Button questionA = (Button)findViewById(R.id.pilihanA);
        questionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                pilihan = "A";
                if(pilihan == getQuestionLibrary.getAnswer(questionNumber-1)){
                    score =score +1;
                    updateQuestion();
                }
                else {
                    updateQuestion();
                }
            }
        });

        Button questionB = (Button)findViewById(R.id.pilihanB);
        questionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                pilihan = "B";
                if(pilihan == getQuestionLibrary.getAnswer(questionNumber-1)){
                    score =score +1;
                    updateQuestion();
                }
                else {
                    updateQuestion();
                }
            }
        });

        Button questionC = (Button)findViewById(R.id.pilihanC);
        questionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                pilihan = "C";
                if(pilihan == getQuestionLibrary.getAnswer(questionNumber-1)){
                    score =score +1;
                    updateQuestion();
                }
                else {
                    updateQuestion();
                }
            }
        });

        Button questionD = (Button)findViewById(R.id.pilihanD);
        questionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                pilihan = "D";
                if(pilihan == getQuestionLibrary.getAnswer(questionNumber-1)){
                    score =score +1;
                    updateQuestion();
                }
                else {
                    updateQuestion();
                }
            }
        });
    }

    public void updateQuestion (){
        if((questionNumber) == 20){
            Intent intent = new Intent(this, finalScore.class);
            intent.putExtra("my_score", score);
            startActivity(intent);
            finish();
        }
        else {
            TextView getQuestion = (TextView) findViewById(R.id.Pertanyaan);
            getQuestion.setText(getQuestionLibrary.getQuestion(questionNumber));

            Button getChoiceA = (Button) findViewById(R.id.pilihanA);
            getChoiceA.setText(getQuestionLibrary.getChoices(questionNumber, 0));

            Button getChoiceB = (Button) findViewById(R.id.pilihanB);
            getChoiceB.setText(getQuestionLibrary.getChoices(questionNumber, 1));

            Button getChoiceC = (Button) findViewById(R.id.pilihanC);
            getChoiceC.setText(getQuestionLibrary.getChoices(questionNumber, 2));

            Button getChoiceD = (Button) findViewById(R.id.pilihanD);
            getChoiceD.setText(getQuestionLibrary.getChoices(questionNumber, 3));

            questionNumber = questionNumber + 1;
            Log.d("my tag", "score" + score + "number" + questionNumber);

        }
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
