package com.example.bookingticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.Seat_Page.SeatActivity;
import com.example.bookingticket.PayPage_SettingPage.PayPage;
import com.example.bookingticket.PayPage_SettingPage.SettingPage;
import com.example.bookingticket.PersonPage.MainPersonPage;
import com.example.bookingticket.PersonPage.PersonFragment;
import com.example.bookingticket.ProfilePhim.ProfilePhim;
import com.example.bookingticket.Screening_Detail_Page.ScreeningActivity;

public class MainActivity extends AppCompatActivity {

    private Button trangthanhtoan, trangsetting, trangscreening, trangperson, trangprofilephim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trangthanhtoan = findViewById(R.id.trangthanhtoan);
        trangsetting = findViewById(R.id.trangsetting);
        trangscreening = findViewById(R.id.trangscreening);
        trangperson = findViewById(R.id.trangperson);
        trangprofilephim = findViewById(R.id.trangprofilephim);

        trangprofilephim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilePhim.class);
                startActivity(intent);
            }
        });

        trangperson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainPersonPage.class);
                startActivity(intent);
            }
        });

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