package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    int puntos = 0;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Question 1
     * @param view
     */
    public void question1 (View view){
        RadioButton correct = (RadioButton) findViewById(R.id.question_1_capital_2);
        if (correct.isChecked()){
            puntos++;
        }

    }

    /**
     * Question 2
     * @param view
     */
    public void question2 (View view){
        RadioButton correct = (RadioButton) findViewById(R.id.question_2_capital_3);
        if (correct.isChecked()){
            puntos++;
        }
    }

    /**
     * Question 3
     * @param view
     */
    public void question3 (View view){
        RadioButton correct = (RadioButton) findViewById(R.id.question_3_capital_2);
        if (correct.isChecked()){
            puntos++;
        }
    }

    /**
     * Question 4
     * @param view
     */

    public void question4(View view) {

        boolean checked_capital1;
        boolean checked_capital2;
        boolean checked_capital3;
        boolean checked_capital4;

        CheckBox correct1 = (CheckBox) findViewById(R.id.check_capital1);
        if (correct1.isChecked()){
            checked_capital1 = true;
        } else {
            checked_capital1 = false;
        }

        CheckBox correct2 = (CheckBox) findViewById(R.id.check_capital2);
        if (correct2.isChecked()){
            checked_capital2 = true;
        } else {
            checked_capital2 = false;
        }

        CheckBox incorrect1 = (CheckBox) findViewById (R.id.check_capital3);
        if (incorrect1.isChecked()){
            checked_capital3 = true;
        } else {
            checked_capital3 = false;
        }

        CheckBox incorrect2 = (CheckBox) findViewById (R.id.check_capital4);
        if (incorrect2.isChecked()){
            checked_capital4 = true;
        } else {
            checked_capital4 = false;
        }


        if ((checked_capital1)&&(checked_capital2)&&(!checked_capital3)&&(!checked_capital4)){
            puntos++;
        }
    }


    /**
     *Question 5
     * @param View
     * @return
     */
    public void question5(View View) {
        EditText text = (EditText) findViewById(R.id.question5_editText);
        String capital = text.getText().toString().trim();
        String capitalMin = capital.toLowerCase();
        if (capitalMin.equals("cyprus")) {
            puntos ++;
        }

    }

    /**
     * Submit -- Show all points and reset points.
     * @param view
     */
    public void submit (View view){
        question1(view);
        question2(view);
        question3(view);
        question4(view);
        question5(view);
        Toast.makeText(getApplicationContext(),"Points: " + puntos + "/5",Toast.LENGTH_SHORT ).show();
        puntos=0;
    }

    /**
     * Reset radioButtons, checkBoxes and editText.
     * @param view
     */
    public void resetAll(View view){

        //RESET QUESTION 1

        radioGroup = (RadioGroup)findViewById(R.id.MyRadioGroup1);
        radioGroup.clearCheck();

        //RESET QUESTION 2
        radioGroup = (RadioGroup)findViewById(R.id.MyRadioGroup2);
        radioGroup.clearCheck();

        //RESET QUESTION 3
        radioGroup = (RadioGroup)findViewById(R.id.MyRadioGroup3);
        radioGroup.clearCheck();

        //RESET QUESTION 4
        CheckBox check1 = (CheckBox) findViewById(R.id.check_capital1);
        if (check1.isChecked()) {check1.setChecked(false);}

        CheckBox check2 = (CheckBox) findViewById(R.id.check_capital2);
        if (check2.isChecked()) {check2.setChecked(false);}

        CheckBox check3 = (CheckBox) findViewById(R.id.check_capital3);
        if (check3.isChecked()) {check3.setChecked(false);}

        CheckBox check4 = (CheckBox) findViewById(R.id.check_capital4);
        if (check4.isChecked()) {check4.setChecked(false);}

        // RESET QUESTION 5
        EditText text = (EditText) findViewById(R.id.question5_editText);
        text.setText(null);
    }

}
