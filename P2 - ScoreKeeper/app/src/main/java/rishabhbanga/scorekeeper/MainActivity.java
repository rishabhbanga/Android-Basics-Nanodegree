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

        Button ThreePointsA = (Button) findViewById(R.id.threepointsAbttn);
        ThreePointsA.setOnClickListener(this);
        Button TwoPointsA = (Button) findViewById(R.id.twopointsAbttn);
        TwoPointsA.setOnClickListener(this);
        Button OnePointA = (Button) findViewById(R.id.onepointAbttn);
        OnePointA.setOnClickListener(this);

        Button ThreePointsB = (Button) findViewById(R.id.threepointsBbttn);
        ThreePointsB.setOnClickListener(this);
        Button TwoPointsB = (Button) findViewById(R.id.twopointsBbttn);
        TwoPointsB.setOnClickListener(this);
        Button OnePointB = (Button) findViewById(R.id.onepointBbttn);
        OnePointB.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.threepointsAbttn:
                ScoreTeamA = ScoreTeamA + 3;
                onScoreA(ScoreTeamA);
                break;

            case R.id.twopointsAbttn:
                ScoreTeamA = ScoreTeamA + 2;
                onScoreA(ScoreTeamA);
                break;

            case R.id.onepointAbttn:
                ScoreTeamA++;
                onScoreA(ScoreTeamA);
                break;

            case R.id.threepointsBbttn:
                ScoreTeamB = ScoreTeamB + 3;
                onScoreB(ScoreTeamB);
                break;

            case R.id.twopointsBbttn:
                ScoreTeamB = ScoreTeamB + 2;
                onScoreB(ScoreTeamB);
                break;

            case R.id.onepointBbttn:
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