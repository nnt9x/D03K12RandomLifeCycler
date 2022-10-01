package com.bkacad.nnt.d03k12randomlifecycler;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.bkacad.nnt.d03k12randomlifecycler.utils.MyRandom;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout rootView;
    private TextView tvNumber;
    private int rdNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootView = findViewById(R.id.rootView);
        tvNumber = findViewById(R.id.tvNumber);
    }

    @Override
    protected void onResume() {
        super.onResume();
        rdNum = MyRandom.getRandomNumber(0, 1000);
        tvNumber.setText(String.valueOf(rdNum));
        rootView.setBackgroundColor(Color.parseColor(MyRandom.getColorString()));
    }
}