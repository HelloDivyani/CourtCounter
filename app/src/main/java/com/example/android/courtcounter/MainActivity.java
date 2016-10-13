package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void ThreePointsA(View v)
    {

        scoreTeamA=scoreTeamA+3;

        displayForTeamA(scoreTeamA);

    }
    public void ThreePointsB(View v)
    {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);

    }

    public void TwoPointsA(View v)
    {
        scoreTeamA=scoreTeamA+2;

        displayForTeamA(scoreTeamA);


    }
    public void TwoPointsB(View v)

    {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);


    }

    public void FreeThrowA(View v)
    {
        scoreTeamA=scoreTeamA+1;

        displayForTeamA(scoreTeamA);


    }
    public void FreeThrowB(View v)
    {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void ResetButton(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
