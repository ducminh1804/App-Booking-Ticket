package com.example.Seat_Page;

import static com.example.bookingticket.R.id.seat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.bookingticket.R;

public class SeatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat);

        GridLayout gridLayout = findViewById(R.id.seat);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (col != 2) { // Bỏ qua cột thứ 3
                    Button button = new Button(this);
                    button.setText("Row " + row + " Col " + col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.rowSpec = GridLayout.spec(row); // Đặt hàng
                    params.columnSpec = GridLayout.spec(col); // Đặt cột
                    gridLayout.addView(button, params);
                }
            }
        }
    }
}