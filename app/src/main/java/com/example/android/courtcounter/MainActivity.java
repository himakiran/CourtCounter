package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScore(Score);

    }


    private void displayScore(int score) {
        TextView t = (TextView) findViewById(R.id.scoreBoard);
        //t.setText("" + score);
        t.setText(String.valueOf(score));
    }

    public void threePointer(View view) {
        Score += 3;displayScore(Score);
    }

    public void twopointer(View view) {
        Score += 2;displayScore(Score);
    }

    public void freeThrow(View view) {
        Score += 1;displayScore(Score);
    }
}