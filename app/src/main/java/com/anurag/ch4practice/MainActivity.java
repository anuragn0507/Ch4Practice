package com.anurag.ch4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String [] questions = {"Static functions can be accessed using null reference ?", "Can we have multiple classes in same java file?",
            "is 0.0d the default value of double variable? ", "Is String is primary data type"};
    private boolean [] answers = {false, true , true, false};
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
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If the array is not going out of bounds
                if (index <= questions.length - 1) {
                    //If you given correct answer
                    if (answers[index] == true) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is " + score + "/" +  questions.length , Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }


            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If the array is not going out of bounds
                if (index <= questions.length - 1) {
                    //If you given correct answer
                    if (answers[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is " + score + "/" +  questions.length, Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }


            }

        });

    }
}