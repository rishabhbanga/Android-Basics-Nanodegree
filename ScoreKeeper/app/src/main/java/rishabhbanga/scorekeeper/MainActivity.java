package rishabhbanga.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         /*
        Adding this keyword to the onClickListener() method. It redirects call to the onClick() method.
        If you don't use `this` keyword here, your call will not be redirected to onClick() method when user
        performs click.
        */

        Button GoalA = (Button) findViewById(R.id.GoalAbttn);
        GoalA.setOnClickListener(this);
        Button FreeKickA = (Button) findViewById(R.id.FreeKickAbttn);
        FreeKickA.setOnClickListener(this);
        Button PenaltyA = (Button) findViewById(R.id.PenaltyAbttn);
        PenaltyA.setOnClickListener(this);

        Button GoalB = (Button) findViewById(R.id.GoalBbttn);
        GoalB.setOnClickListener(this);
        Button FreeKickB = (Button) findViewById(R.id.FreeKickBbttn);
        FreeKickB.setOnClickListener(this);
        Button PenaltyB = (Button) findViewById(R.id.PenaltyBbttn);
        PenaltyB.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.GoalAbttn:
                ScoreTeamA++;
                onScoreA(ScoreTeamA);
                break;

            case R.id.FreeKickAbttn:
                ScoreTeamA++;
                onScoreA(ScoreTeamA);
                break;

            case R.id.PenaltyAbttn:
                ScoreTeamA++;
                onScoreA(ScoreTeamA);
                break;

            case R.id.GoalBbttn:
                ScoreTeamB++;
                onScoreB(ScoreTeamB);
                break;

            case R.id.FreeKickBbttn:
                ScoreTeamB++;
                onScoreB(ScoreTeamB);
                break;

            case R.id.PenaltyBbttn:
                ScoreTeamB++;
                onScoreB(ScoreTeamB);
                break;

            default:
                break;
        }

    }

    public void onScoreA(int score)
    {
        TextView ScoreViewA = (TextView) findViewById(R.id.ScoreAtv);
        ScoreViewA.setText(String.valueOf(score));
    }

    public void onScoreB(int score)
    {
        TextView ScoreViewB = (TextView) findViewById(R.id.ScoreBtv);
        ScoreViewB.setText(String.valueOf(score));
    }

    public void onReset(View v)
    {
        ScoreTeamA = 0;
        onScoreA(ScoreTeamA);
        ScoreTeamB = 0;
        onScoreB(ScoreTeamB);
    }
}