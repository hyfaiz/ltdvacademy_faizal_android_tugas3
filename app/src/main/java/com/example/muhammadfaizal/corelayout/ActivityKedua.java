package com.example.muhammadfaizal.corelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.muhammadfaizal.corelayout.R;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
