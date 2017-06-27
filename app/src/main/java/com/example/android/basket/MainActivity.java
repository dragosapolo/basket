package com.example.android.basket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faultTeamA = 0;
    int faultTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    * Code for TeamA
    * */
    public void teamA1Point(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void teamA2Points(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    public void teamA3Points(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void team_a_fault(View view){
        faultTeamA=faultTeamA+1;
        FaultForTeamA(faultTeamA);
    }



    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void FaultForTeamA(int fault) {
        TextView faultView = (TextView) findViewById(R.id.team_a_score_fault);
        faultView.setText(String.valueOf(fault));
    }
/*
* Team A Code the end
* */

    /*
    * Code for TeamB
    * */
    public void teamB1Point(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void teamB2Points(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void teamB3Points(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void team_b_fault(View view){
        faultTeamB=faultTeamB+1;
        FaultForTeamB(faultTeamB);
    }

    private void FaultForTeamB(int fault) {
        TextView faultView = (TextView) findViewById(R.id.team_b_score_fault);
        faultView.setText(String.valueOf(fault));
    }

    //Reset button code for score
    public void reset_points(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);

    }

    //Reset button code for score
    public void reset_faults(View view) {
        faultTeamA = 0;
        faultTeamB = 0;
        FaultForTeamA(0);
        FaultForTeamB(0);

    }



}
