package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class bluetooth extends AppCompatActivity {

    public static int BLUETOOTH_REQ_CODE = 1;
    ImageButton iv_bluetooth;
    BluetoothAdapter bluetoothAdapter;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        iv_bluetooth = findViewById(R.id.imageButton6);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(bluetoothAdapter == null) {
            Toast.makeText(bluetooth.this, "Bluetooth not supported", Toast.LENGTH_LONG).show();
        }
        if(!bluetoothAdapter.isEnabled()) {
            iv_bluetooth.setImageDrawable(getResources().getDrawable(R.drawable.blueoff));
        }
        else {
            iv_bluetooth.setImageDrawable(getResources().getDrawable(R.drawable.blueon));
        }
        iv_bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!bluetoothAdapter.isEnabled()) {
                    Intent bluetooth_intent = new  Intent((BluetoothAdapter.ACTION_REQUEST_ENABLE));
                    startActivityForResult(bluetooth_intent, BLUETOOTH_REQ_CODE);
                }
                else {
                    bluetoothAdapter.disable();
                    iv_bluetooth.setImageDrawable(getResources().getDrawable(R.drawable.blueoff));
                }
            }
        });
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK) {
            Toast.makeText(bluetooth.this, "Bluetooth is On", Toast.LENGTH_SHORT).show();
            iv_bluetooth.setImageDrawable(getResources().getDrawable(R.drawable.blueon));
        }
        else {
            if (resultCode == RESULT_CANCELED) {
                Toast.makeText(bluetooth.this, "Give Bluetooth Permission", Toast.LENGTH_SHORT).show();
            }
        }
    }
}