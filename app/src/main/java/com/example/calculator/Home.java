package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goto_calculator(View view) {
        Intent calc = new Intent(this, MainActivity.class);
        startActivity(calc);
    }

    public void goto_texttos(View view) {
        Intent tts_goto = new Intent(this, Texttospeech.class);
        startActivity(tts_goto);
    }

    public void goto_blue(View view) {
        Intent blue_goto = new Intent(this, bluetooth.class);
        startActivity(blue_goto);
    }
}