/*
Author: Chris H.
Purpose: Multi question Quiz for final Project of Android Beginners
Date: 04/10/18
 */



package com.cheyennelabs.pinballquiz;

// Importing both Views as well as widgets for questions in the

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.cheyennelabs.pinballquiz.R;

public class MainActivity extends AppCompatActivity {

    // onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // This is what happens when the submit button is pressed.
    protected void computeScore(View view){

        int totalCorrect = 0;

        EditText player;
        player = findViewById(R.id.player);
        String playerName = player.getText().toString()
        // Let's start gathering the responses that should have something in them!
        RadioButton radioOne20270 = (RadioButton) findViewById(R.id.radio_20270);
        boolean isRadioOne20270Checked = radioOne20270.isChecked();
radioOne20270.setChecked(false);
        //Semi Cheat - This question needs all boxes Checked
        CheckBox questionTwoKISS  = (CheckBox) findViewById(R.id.checkbox_q2_kiss);
        boolean isQuestionTwoKISSChecked = questionTwoKISS.isChecked();
        CheckBox questionTwoStones = (CheckBox) findViewById(R.id.checkbox_q2_stones);
        boolean isQuestionTwoStonesChecked = questionTwoStones.isChecked();
        CheckBox questionTwoRoses  = (CheckBox) findViewById(R.id.checkbox_q2_roses);
        boolean isQuestionTwoRosesChecked = questionTwoRoses.isChecked();
        CheckBox questionTwoAreosmith = (CheckBox) findViewById(R.id.checkbox_q2_areosmith);
        boolean isQuestionTwoAreosmithChecked = questionTwoAreosmith.isChecked();
questionTwoKISS.setChecked(false);
        //Radio Button - Fish tales is the one that was not designed
        RadioButton radioThreeFish = (RadioButton) findViewById(R.id.radio_fish);
        boolean isRadioThreeFishChecked = radioThreeFish.isChecked();

        // Once again, all checks are correct!
        CheckBox questionFourSanta  = (CheckBox) findViewById(R.id.checkbox_q4_santa);
        boolean isQuestionFourSantaChecked = questionFourSanta.isChecked();
        CheckBox questionFourPinbot = (CheckBox) findViewById(R.id.checkbox_q4_pinbot);
        boolean isQuestionFourPinbotChecked = questionFourPinbot.isChecked();
        CheckBox questionFourGorbachev  = (CheckBox) findViewById(R.id.checkbox_q4_gorbachev);
        boolean isQuestionFourGorbachevChecked = questionFourGorbachev.isChecked();
        CheckBox questionFourMonroe = (CheckBox) findViewById(R.id.checkbox_q4_monroe);
        boolean isQuestionFourMonroeChecked = questionFourMonroe.isChecked();

        //Get the response in.
        EditText InventedTilt = findViewById(R.id.who_invented_tilt);
        String whoInventedTilt = InventedTilt.getText().toString();
        String correctInventTilt = "Harry Williams";

        //Time to do the math and figure out the score!

        if (isRadioOne20270Checked){
            totalCorrect = totalCorrect + 1;
        }
        if (isQuestionTwoKISSChecked && isQuestionTwoStonesChecked && isQuestionTwoRosesChecked && isQuestionTwoAreosmithChecked){
            totalCorrect = totalCorrect + 1;
        }
        if (isRadioThreeFishChecked) {
            totalCorrect = totalCorrect + 1;
        }
        if (isQuestionFourSantaChecked && isQuestionFourPinbotChecked && isQuestionFourGorbachevChecked && isQuestionFourMonroeChecked) {
            totalCorrect = totalCorrect + 1;
        }
        if (whoInventedTilt.equals(correctInventTilt) ) {
            totalCorrect = totalCorrect + 1;
        }
        Toast.makeText(MainActivity.this, "Congrats: " + playerName + " " + totalCorrect + " out of 5 possible points!",
                Toast.LENGTH_LONG).show();
        }
    }
