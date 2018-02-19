package com.example.android.snookercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String SCORE_PLAYER1 = "scorePlayerOne";
    static final String SCORE_PLAYER2 = "scorePlayerTwo";
    static final String RED_BALLS = "redBalls";
    static final String LAST_ACTIVITY = "lastActivity";
    static final String LAST_ACTIVITY_PLAYER = "lastActivityPlayer";

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
        outState.putInt(SCORE_PLAYER1, scorePlayerOne);
        outState.putInt(SCORE_PLAYER2, scorePlayerTwo);
        outState.putInt(RED_BALLS, redBalls);
        outState.putInt(LAST_ACTIVITY, lastActivity);
        outState.putInt(LAST_ACTIVITY_PLAYER, lastActivityPlayer);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scorePlayerOne = savedInstanceState.getInt(SCORE_PLAYER1);
        scorePlayerTwo = savedInstanceState.getInt(SCORE_PLAYER2);
        redBalls = savedInstanceState.getInt(RED_BALLS);
        lastActivity = savedInstanceState.getInt(LAST_ACTIVITY);
        lastActivityPlayer = savedInstanceState.getInt(LAST_ACTIVITY_PLAYER);
        displayScoreForPlayerOne();
        displayScoreForPlayerTwo();
        displayRedBalls();
    }

    /**
     * Add 1 point for Player One.
     */
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

    /**
     * Add 1 point for Player Two.
     */
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

    /**
     * Add 2 points for Player One.
     */
    public void yellowBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 2;
        lastActivity = 2;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 2 points for Player Two.
     */
    public void yellowBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 2;
        lastActivity = 2;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 3 points for Player One.
     */
    public void greenBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 3;
        lastActivity = 3;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 3 points for Player Two.
     */
    public void greenBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 3;
        lastActivity = 3;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 4 points for Player One.
     */
    public void brownBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 4;
        lastActivity = 4;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 4 points for Player Two.
     */
    public void brownBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 4;
        lastActivity = 4;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 5 points for Player One.
     */
    public void blueBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 5;
        lastActivity = 5;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 5 points for Player Two.
     */
    public void blueBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 5;
        lastActivity = 5;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 6 points for Player One.
     */
    public void pinkBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 6;
        lastActivity = 6;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 6 points for Player Two.
     */
    public void pinkBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 6;
        lastActivity = 6;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 7 points for Player One.
     */
    public void blackBallForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 7;
        lastActivity = 7;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 7 points for Player One.
     */
    public void blackBallForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 7;
        lastActivity = 7;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 4 fault points for Player Two.
     */
    public void faultFourForPlayerOne(View v) {
        scorePlayerTwo = scorePlayerTwo + 4;
        lastActivity = 4;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 4 fault points for Player One.
     */
    public void faultFourForPlayerTwo(View v) {
        scorePlayerOne = scorePlayerOne + 4;
        lastActivity = 4;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 5 fault points for Player Two.
     */
    public void faultFiveForPlayerOne(View v) {
        scorePlayerTwo = scorePlayerTwo + 5;
        lastActivity = 5;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 5 fault points for Player One.
     */
    public void faultFiveForPlayerTwo(View v) {
        scorePlayerOne = scorePlayerOne + 5;
        lastActivity = 5;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 6 fault points for Player Two.
     */
    public void faultSixForPlayerOne(View v) {
        scorePlayerTwo = scorePlayerTwo + 6;
        lastActivity = 6;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 6 fault points for Player One.
     */
    public void faultSixForPlayerTwo(View v) {
        scorePlayerOne = scorePlayerOne + 6;
        lastActivity = 6;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Add 7 fault points for Player Two.
     */
    public void faultSevenPlayerOne(View v) {
        scorePlayerTwo = scorePlayerTwo + 7;
        lastActivity = 7;
        lastActivityPlayer = 2;
        displayScoreForPlayerTwo();
    }

    /**
     * Add 4 fault points for Player One.
     */
    public void faultSevenPlayerTwo(View v) {
        scorePlayerOne = scorePlayerOne + 7;
        lastActivity = 7;
        lastActivityPlayer = 1;
        displayScoreForPlayerOne();
    }

    /**
     * Reset the score for both players.
     */
    public void resetScore(View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        redBalls = 15;
        displayScoreForPlayerOne();
        displayScoreForPlayerTwo();
        displayRedBalls();
    }

    /**
     * Remove the last added points from player.
     */
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
     * Displays the score for Player One.
     */
    public void displayScoreForPlayerOne() {
        scorePlayerOneTV.setText(String.valueOf(scorePlayerOne));
    }

    /**
     * Displays the score for Player Two.
     */
    public void displayScoreForPlayerTwo() {
        scorePlayerTwoTV.setText(String.valueOf(scorePlayerTwo));
    }

    /**
     * Displays the remaining Red Balls on table.
     */
    public void displayRedBalls() {
        redBallsTV.setText(String.valueOf(redBalls));
    }
}
