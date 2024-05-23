package com.example.homepage_lephamhungha_mobile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.Adapter.SapChieuAdapter;
//import com.Adapter.SapChieuSlideAdapter;
import com.example.homepage_lephamhungha_mobile.R;

import java.util.ArrayList;
import Adapter.SlideAdapter;
import Adapter.UuDaiSlideAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPager viewPagerUuDai;
    private RecyclerView recyclerViewSapChieu;
    private Spinner spinnerMovie;
    private Button buttonBuyTicket;
    private SlideAdapter slideAdapter;
    private UuDaiSlideAdapter uuDaiSlideAdapter;
    private SapChieuAdapter sapChieuAdapter;
    private ArrayList<Integer> images;
    private ArrayList<Integer> uuDaiImages;
    private ArrayList<Integer> sapChieuImages;
    private ArrayList<String> captions;
    private Handler handler;
    private Runnable runnable;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Thiết lập padding cho layout để tránh việc nội dung bị che khuất bởi thanh điều hướng
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            v.setPadding(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(),
                    insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
            return insets;
        });

        // Khởi tạo ViewPager cho nội dung chính
        viewPager = findViewById(R.id.viewPager);
        images = new ArrayList<>();
        images.add(R.drawable.hinh1);
        images.add(R.drawable.hinh2);
        images.add(R.drawable.hinh3);
        images.add(R.drawable.hinh4);
        captions = new ArrayList<>();
        captions.add("Tà Khúc Triệu Vong (T18)");
        captions.add("TAROT (T18)");
        captions.add("Lật mặt 7 (Một điều ước)");
        captions.add("Godzilla vs Kong");
        slideAdapter = new SlideAdapter(this, images, captions);
        viewPager.setAdapter(slideAdapter);

        // Khởi tạo ViewPager cho ưu đãi
        viewPagerUuDai = findViewById(R.id.viewPageruudai);
        uuDaiImages = new ArrayList<>();
        uuDaiImages.add(R.drawable.hinhuudai1);
        uuDaiImages.add(R.drawable.hinhuudai2);
        uuDaiImages.add(R.drawable.hinhuudai3);
        uuDaiImages.add(R.drawable.hinhuudai4);
        uuDaiSlideAdapter = new UuDaiSlideAdapter(this, uuDaiImages);
        viewPagerUuDai.setAdapter(uuDaiSlideAdapter);

        // Khởi tạo RecyclerView cho phim sắp chiếu
        recyclerViewSapChieu = findViewById(R.id.recyclerViewSapChieu);
        recyclerViewSapChieu.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        sapChieuImages = new ArrayList<>();
        sapChieuImages.add(R.drawable.phimsapchieuhinh1);
        sapChieuImages.add(R.drawable.phimsapchieuhinh2);
        sapChieuImages.add(R.drawable.phimsapchieuhinh3);
        sapChieuImages.add(R.drawable.phimsapchieuhinh4);
        sapChieuAdapter = new SapChieuAdapter(this, sapChieuImages);
        recyclerViewSapChieu.setAdapter(sapChieuAdapter);

        // Cài đặt Spinner cho việc chọn phim
        spinnerMovie = findViewById(R.id.spinner_movie);
        final String[] movies = {"Phim 1", "Phim 2", "Phim 3"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, movies);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMovie.setAdapter(adapter1);
        spinnerMovie.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedMovie = movies[position];
                Toast.makeText(MainActivity.this, "Phim được chọn: " + selectedMovie, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Cài đặt nút Mua Vé
        buttonBuyTicket = findViewById(R.id.button_buy_ticket);
        buttonBuyTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedMovie = (String) spinnerMovie.getSelectedItem();
                Toast.makeText(MainActivity.this, "Đang mua vé cho: " + selectedMovie, Toast.LENGTH_SHORT).show();
            }
        });

        // Khởi tạo và bắt đầu tự động cuộn trang cho ViewPager Phim
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                int currentItem = viewPager.getCurrentItem();
                int totalItems = slideAdapter.getCount();
                if (currentItem < totalItems - 1) {
                    currentItem++;
                } else {
                    currentItem = 0;
                }
                viewPager.setCurrentItem(currentItem, true); // true để có hiệu ứng cuộn mượt mà
                handler.postDelayed(this, 8000); // 8000 milliseconds = 8 giây
            }
        };
        handler.postDelayed(runnable, 8000); // Bắt đầu cuộn trang sau 8 giây đầu tiên

        // Khởi tạo và bắt đầu tự động cuộn trang cho ViewPager ưu đãi
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                int currentItem = viewPagerUuDai.getCurrentItem();
                int totalItems = uuDaiSlideAdapter.getCount();
                if (currentItem < totalItems - 1) {
                    currentItem++;
                } else {
                    currentItem = 0;
                }
                viewPagerUuDai.setCurrentItem(currentItem, true); // true để có hiệu ứng cuộn mượt mà
                handler.postDelayed(this, 5000); // 5000 milliseconds = 5 giây
            }
        };
        handler.postDelayed(runnable, 5000); // Bắt đầu cuộn trang sau 5 giây đầu tiên
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Loại bỏ các callbacks của handler khi Activity bị hủy
        handler.removeCallbacks(runnable);
    }
}
