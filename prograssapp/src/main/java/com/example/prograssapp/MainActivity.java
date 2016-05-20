package com.example.prograssapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ZProgressHUD hud=ZProgressHUD.getInstance(this);
        hud.setMessage("加载中...");
//        hud.setSpinnerType(ZProgressHUD.GEAR_SPINNER);
        hud.setSpinnerType(ZProgressHUD.SIMPLE_ROUND_SPINNER);
        hud.show();
    }
}
