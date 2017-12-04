package com.example.android.snookercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scorePlayerOneTV;
    TextView scorePlayerTwoTV;
    TextView redBallsTV;
    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;
    int redBalls = 15;
    int lastActivity = 0;
    int lastActivityPlayer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scorePlayerOneTV = findViewById(R.id.player_one_score);
        scorePlayerTwoTV = findViewById(R.id.player_two_score);
        redBallsTV = findViewById(R.id.red_balls);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scorePlayerOne", scorePlayerOne);
        outState.putInt("scorePlayerTwo", scorePlayerTwo);
        outState.putInt("redBalls", redBalls);
        outState.putInt("lastActivity", lastActivity);
        outState.putInt("lastActivityPlayer", lastActivityPlayer);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scorePlayerOne = savedInstanceState.getInt("scorePlayerOne");
        scorePlayerTwo = savedInstanceState.getInt("scorePlayerTwo");
        redBalls = savedInstanceState.getInt("redBalls");
        lastActivity = savedInstanceState.getInt("lastActivity");
        lastActivityPlayer = savedInstanceState.getInt("lastActivityPlayer");
        displayScoreForPlayerOne();
        displayScoreForPlayerTwo();
        displayRedBalls();
    }

    public void redBallForPlayerOne(View v) {
        if (redBalls > 0) {
            scorePlayerOne = scorePlayerOne + 1;
            redBalls = redBalls - 1;
        }
        lastActivity = 1;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
        displayRedBalls();
    }

    public void redBallForPlayerTwo(View v) {
        if (redBalls > 0) {
            scorePlayerTwo = scorePlayerTwo + 1;
            redBalls = redBalls - 1;
        }
        lastActivity = 1;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
        displayRedBalls();
    }

    public void yellowBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 2;
        lastActivity = 2;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void yellowBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 2;
        lastActivity = 2;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void greenBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 3;
        lastActivity = 3;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void greenBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 3;
        lastActivity = 3;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void brownBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 4;
        lastActivity = 4;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void brownBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 4;
        lastActivity = 4;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void blueBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 5;
        lastActivity = 5;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void blueBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 5;
        lastActivity = 5;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void pinkBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 6;
        lastActivity = 6;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void pinkBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 6;
        lastActivity = 6;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void blackBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 7;
        lastActivity = 7;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void blackBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 7;
        lastActivity = 7;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void faultFourForPlayerOne(View v) {
        scorePlayerTwo = scorePlayerTwo + 4;
        lastActivity = 4;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void faultFourForPlayerTwo(View v) {
        scorePlayerOne = scorePlayerOne + 4;
        lastActivity = 4;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void faultFiveForPlayerOne(View v) {
        scorePlayerTwo = scorePlayerTwo + 5;
        lastActivity = 5;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void faultFiveForPlayerTwo(View v) {
        scorePlayerOne = scorePlayerOne + 5;
        lastActivity = 5;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void faultSixForPlayerOne(View v) {
        scorePlayerTwo = scorePlayerTwo + 6;
        lastActivity = 6;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void faultSixForPlayerTwo(View v) {
        scorePlayerOne = scorePlayerOne + 6;
        lastActivity = 6;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void faultSevenPlayerOne(View v) {
        scorePlayerTwo = scorePlayerTwo + 7;
        lastActivity = 7;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    public void faultSevenPlayerTwo(View v) {
        scorePlayerOne = scorePlayerOne + 7;
        lastActivity = 7;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    public void resetScore(View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        redBalls = 15;
        displayScoreForPlayerOne();
        displayScoreForPlayerTwo();
        displayRedBalls();
    }

    public void undoScore(View v) {
        if (lastActivityPlayer == 1) {
            if (scorePlayerOne > 0) {
                scorePlayerOne = scorePlayerOne - lastActivity;
                if (lastActivity == 1) {
                    redBalls = redBalls + 1;
                }
                lastActivity = 0;
                lastActivityPlayer = 0;
                displayScoreForPlayerOne();
                displayRedBalls();
            }
        }

        if (lastActivityPlayer == 2) {
            if (scorePlayerTwo > 0) {
                scorePlayerTwo = scorePlayerTwo - lastActivity;
                if (lastActivity == 1) {
                    redBalls = redBalls + 1;
                }
                lastActivity = 0;
                lastActivityPlayer = 0;
                displayScoreForPlayerTwo();
                displayRedBalls();
            }
        }
    }

    /**
     * Displays the given score for Player One.
     */
    public void displayScoreForPlayerOne() {
        scorePlayerOneTV.setText(String.valueOf(scorePlayerOne));
    }

    /**
     * Displays the given score for Player Two.
     */
    public void displayScoreForPlayerTwo() {
        scorePlayerTwoTV.setText(String.valueOf(scorePlayerTwo));
    }

    /**
     * Displays the Red Balls on table.
     */
    public void displayRedBalls() {
        redBallsTV.setText(String.valueOf(redBalls));
    }
}
