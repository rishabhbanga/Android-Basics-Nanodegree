package rishabhbanga.quiztowhiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);
    }

    public void onClickStart(View v)
    {
        Intent i = new Intent(MainMenu.this, Quiz_1.class);
        startActivity(i);
    }
}