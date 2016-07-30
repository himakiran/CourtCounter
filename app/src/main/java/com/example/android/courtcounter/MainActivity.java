package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /**
     * Displays the given score for Team A.
     */
    public int scoreTeamA = 0;
    public int scoreTeamB = 0;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeforTeamA(View view)
    {
        scoreTeamA += 3;displayForTeamA(scoreTeamA);
    }
    public void addTwoforTeamA(View view)
    {
        scoreTeamA += 2;displayForTeamA(scoreTeamA);
    }
    public void addOneforTeamA(View view)
    {
        scoreTeamA += 1;displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeforTeamB(View view)
    {
        scoreTeamB += 3;displayForTeamB(scoreTeamB);
    }
    public void addTwoforTeamB(View view)
    {
        scoreTeamB += 2;displayForTeamB(scoreTeamB);
    }
    public void addOneforTeamB(View view)
    {
        scoreTeamB += 1;displayForTeamB(scoreTeamB);
    }
    /**
     * Resets the scores of both Team A and Team B
     */
    public void doReset(View view)
    {
        scoreTeamA = 0;
        scoreTeamB =  0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}