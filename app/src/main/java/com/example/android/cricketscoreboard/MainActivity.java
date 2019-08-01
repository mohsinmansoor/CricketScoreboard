package com.example.android.cricketscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int sixRuns = 6;
    final int fourRuns = 4;
    final int threeRuns = 3;
    final int twoRuns = 2;
    final int oneRun = 1;

    int scoreTeamA = 0;
    int wicketsTeamA = 0;

    int scoreTeamB = 0;
    int wicketsTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of wickets lost by Team A.
     */
    public void displayWicketsForTeamA(int wickets) {
        TextView wicketsLost = (TextView) findViewById(R.id.loss_of_wickets_team_a);
        wicketsLost.setText(String.valueOf(wickets));
    }

    /**
     * Adds 6 runs to the total score of Team A.
     */
    public void addSixRunsForTeamA(View view) {
        scoreTeamA = scoreTeamA + sixRuns;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Adds 4 runs to the total score of Team A.
     */
    public void addFourRunsForTeamA(View view) {
        scoreTeamA = scoreTeamA + fourRuns;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Adds 3 runs to the total score of Team A.
     */
    public void addThreeRunsForTeamA(View view) {
        scoreTeamA = scoreTeamA + threeRuns;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Adds 2 runs to the total score of Team A.
     */
    public void addTwoRunsForTeamA(View view) {
        scoreTeamA = scoreTeamA + twoRuns;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Adds 1 run to the total score of Team A.
     */
    public void addOneRunForTeamA(View view) {
        scoreTeamA = scoreTeamA + oneRun;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increases number of wickets lost by 1 for Team A
     */
    public void lossOfWicketsForTeamA(View view) {
        wicketsTeamA = wicketsTeamA + 1;
        displayWicketsForTeamA(wicketsTeamA);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of wickets lost by Team B.
     */
    public void displayWicketsForTeamB(int wickets) {
        TextView wicketsLost = (TextView) findViewById(R.id.loss_of_wickets_team_b);
        wicketsLost.setText(String.valueOf(wickets));
    }

    /**
     * Adds 6 runs to the total score of Team B.
     */
    public void addSixRunsForTeamB(View view) {
        scoreTeamB = scoreTeamB + sixRuns;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Adds 4 runs to the total score of Team B.
     */
    public void addFourRunsForTeamB(View view) {
        scoreTeamB = scoreTeamB + fourRuns;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Adds 3 runs to the total score of Team B.
     */
    public void addThreeRunsForTeamB(View view) {
        scoreTeamB = scoreTeamB + threeRuns;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Adds 2 runs to the total score of Team B.
     */
    public void addTwoRunsForTeamB(View view) {
        scoreTeamB = scoreTeamB + twoRuns;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Adds 1 run to the total score of Team B
     */
    public void addOneRunForTeamB(View view) {
        scoreTeamB = scoreTeamB + oneRun;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increases number of wickets lost by 1 for Team B
     */
    public void lossOfWicketsForTeamB(View view) {
        wicketsTeamB = wicketsTeamB + 1;
        displayWicketsForTeamB(wicketsTeamB);
    }

    /**
     * This will reset scores and wickets for both teams
     */
    public void resetScoreAndWickets(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayWicketsForTeamA(wicketsTeamA);
        displayWicketsForTeamB(wicketsTeamB);
    }
}
