package com.anurag.ch4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String [] questions = {"Who has developed by who ?", "Java is introduced in 1755",
            "Java was written c ", "Is Java was Written in Python"};
    private boolean [] answers = {false, false, true, false};
    private int score = 0;
    Button yes;
    Button no;
    TextView question;

    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        question =findViewById(R.id.question);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answers[index]){
                    score++;
                }
                question.setText(questions[index++]);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answers[index] == false) {
                    score++;

                }
                question.setText(questions[index++]);

            }
        });

    }
}