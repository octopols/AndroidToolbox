package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Optional;

public class tor_activity extends AppCompatActivity {

    private ImageButton switch_tor;
    private CameraManager cameraManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tor);

        switch_tor = findViewById(R.id.imageButton7);
        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        //try {
            //getCameraID = cameraManager.getCameraIdList()[0];
        //} catch (CameraAccessException e) {
       //     e.printStackTrace();
        //}

    }
}