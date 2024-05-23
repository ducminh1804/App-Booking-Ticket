package com.example.bookingticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bookingticket.PayPage_SettingPage.PayPage;
import com.example.bookingticket.PayPage_SettingPage.SettingPage;
import com.example.bookingticket.Screening_Detail_Page.ScreeningActivity;

public class MainActivity extends AppCompatActivity {
    private Button trangthanhtoan, trangsetting, trangscreening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        trangthanhtoan = findViewById(R.id.trangthanhtoan);
        trangsetting = findViewById(R.id.trangsetting);
        trangscreening = findViewById(R.id.trangscreening);

        trangthanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PayPage.class);
                startActivity(intent);
            }
        });

        trangsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingPage.class);
                startActivity(intent);
            }
        });

        trangscreening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScreeningActivity.class);
                startActivity(intent);
            }
        });
    }
}