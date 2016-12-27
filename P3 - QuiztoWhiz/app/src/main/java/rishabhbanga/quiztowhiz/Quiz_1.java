package rishabhbanga.quiztowhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by erishba on 12/27/2016.
 */

public class Quiz_1 extends MainMenu{

    int sc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        q1();
    }

    public void q1() {

        setContentView(R.layout.quiz_rbttn_activity);

        TextView ques = (TextView) findViewById(R.id.questionViewrg);
        RadioGroup option = (RadioGroup) findViewById(R.id.radiogroup);
        final RadioButton a1 = (RadioButton) findViewById(R.id.answer_1_rb);
        final RadioButton a2 = (RadioButton) findViewById(R.id.answer_2_rb);
        final RadioButton a3 = (RadioButton) findViewById(R.id.answer_3_rb);
        final RadioButton a4 = (RadioButton) findViewById(R.id.answer_4_rb);

        ques.setText("Q1. What does SENSEX stands for?");
        a1.setText("Sensitive index");
        a2.setText("Sense index");
        a3.setText("Sensible index");
        a4.setText("Senseless index");

        option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch (checkedId) {
                    case R.id.answer_1_rb:
                        Toast.makeText(
                                Quiz_1.this,
                                "CORRECT: \nSENSEX stands for SENSitive indEX",
                                Toast.LENGTH_SHORT).show();
                        a1.setChecked(true);
                        sc++;
                        q2();
                        break;

                    case R.id.answer_2_rb:
                        Toast.makeText(
                                Quiz_1.this,
                                "INCORRECT: \nSENSEX stands for SENSitive indEX",
                                Toast.LENGTH_SHORT).show();

                        a2.setChecked(false);
                        q2();
                        break;

                    case R.id.answer_3_rb:
                        Toast.makeText(
                                Quiz_1.this,
                                "INCORRECT: \nSENSEX stands for SENSitive indEX",
                                Toast.LENGTH_SHORT).show();
                        a3.setChecked(false);
                        q2();
                        break;

                    case R.id.answer_4_rb:
                        Toast.makeText(
                                Quiz_1.this,
                                "INCORRECT: \nSENSEX stands for SENSitive indEX",
                                Toast.LENGTH_SHORT).show();
                        a4.setChecked(false);
                        q2();
                        break;

                }
            }
        });
    }

    public void q2() {

        setContentView(R.layout.quiz_edittxt_activity);

        TextView ques = (TextView) findViewById(R.id.questionVieweTv);

        ques.setText("Q2. When the firm is issuing shares for the very first time, it is called ?");

        Button submit = (Button) findViewById(R.id.submitbttn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = (EditText) findViewById(R.id.editText);
                final String ans = editText.getText().toString();

                if(ans.isEmpty())
                    {
                        Toast.makeText(
                                Quiz_1.this,
                                "ENTER AN ANSWER",
                                Toast.LENGTH_SHORT).show();
                    }

                else
                    {
                        if (ans.equals("IPO"))
                        {
                            Toast.makeText(
                                    Quiz_1.this,
                                    "CORRECT",
                                    Toast.LENGTH_SHORT).show();
                            sc++;
                            q3();
                        }
                        else
                        {
                            Toast.makeText(
                                    Quiz_1.this,
                                    "INCORRECT",
                                    Toast.LENGTH_SHORT).show();
                            q3();
                        }
                    }
                }
            });
        }

    public void q3() {

        setContentView(R.layout.quiz_rbttn_activity);

        TextView ques = (TextView) findViewById(R.id.questionViewrg);
        RadioGroup option = (RadioGroup) findViewById(R.id.radiogroup);
        final RadioButton a1 = (RadioButton) findViewById(R.id.answer_1_rb);
        final RadioButton a2 = (RadioButton) findViewById(R.id.answer_2_rb);
        final RadioButton a3 = (RadioButton) findViewById(R.id.answer_3_rb);
        final RadioButton a4 = (RadioButton) findViewById(R.id.answer_4_rb);

        ques.setText("Q3. NASDAQ stands for");
        a1.setText("New Association of Securities Dealers Automated Quotation");
        a2.setText("National Assembly of Securities Dealers Automated Quotation");
        a3.setText("National Association of Securities Dealers Automated Quotation");
        a4.setText("National Association of Sensitive Dealers Automated Quotation");

        option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch (checkedId) {
                    case R.id.answer_1_rb:
                        Toast.makeText(
                                Quiz_1.this,
                                "INCORRECT: \nNASDAQ stands for National Association of Securities Dealers Automated Quotation",
                                Toast.LENGTH_LONG).show();
                        a1.setChecked(false);
                        q4();
                        break;

                    case R.id.answer_2_rb:
                        Toast.makeText(
                                Quiz_1.this,
                                "INCORRECT: \nNASDAQ stands for National Association of Securities Dealers Automated Quotation",
                                Toast.LENGTH_LONG).show();
                        a2.setChecked(false);
                        q4();
                        break;

                    case R.id.answer_3_rb:
                        Toast.makeText(
                                Quiz_1.this,
                                "CORRECT: \nNASDAQ stands for National Association of Securities Dealers Automated Quotation",
                                Toast.LENGTH_LONG).show();
                        a3.setChecked(true);
                        sc++;
                        q4();
                        break;

                    case R.id.answer_4_rb:
                        Toast.makeText(
                                Quiz_1.this,
                                "INCORRECT: \nNASDAQ stands for National Association of Securities Dealers Automated Quotation",
                                Toast.LENGTH_LONG).show();
                        a4.setChecked(false);
                        q4();
                        break;
                }
            }
        });
    }

    public void q4(){

        setContentView(R.layout.quiz_chkbox_activity);

        TextView ques = (TextView) findViewById(R.id.questionViewcb);

        final CheckBox a1 = (CheckBox) findViewById(R.id.answer_1_cb);
        final CheckBox a2 = (CheckBox) findViewById(R.id.answer_2_cb);
        final CheckBox a3 = (CheckBox) findViewById(R.id.answer_3_cb);
        final CheckBox a4 = (CheckBox) findViewById(R.id.answer_4_cb);

        ques.setText("Q4. RBI has two departments. Select the correct ones from the list give below");
        a1.setText("Issue Department");
        a2.setText("Problem Department");
        a3.setText("Banking Department");
        a4.setText("Purchase Department");

        Button submit = (Button) findViewById(R.id.submitbttn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a1.isChecked()&&a3.isChecked())

                {
                    Toast.makeText(
                            Quiz_1.this,
                            "CORRECT",
                            Toast.LENGTH_SHORT).show();
                            sc++;
                            result();
                }
                else{

                    Toast.makeText(
                            Quiz_1.this,
                            "INCORRECT.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void result(){

        setContentView(R.layout.score_activity);

        TextView score = (TextView) findViewById(R.id.score);
        score.setText("Your Score is : " +sc);
    }
}