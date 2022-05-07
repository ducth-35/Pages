package com.realinet.fanpagemanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.realinet.fanpagemanager.fragment.Caidat_Fragment;
import com.realinet.fanpagemanager.fragment.Taikhoan_Fragment;
import com.realinet.fanpagemanager.fragment.Taoquangcao_Fragment;
import com.realinet.fanpagemanager.fragment.Thongbao_Fragment;
import com.realinet.fanpagemanager.fragment.Trogiup_Fragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private RecyclerView recyclerView;
//    private ImageView imageView;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        imageView = findViewById(R.id.img_chonloc);
        bottomNavigationView = findViewById(R.id.bottomNAV);
        text = (TextView) findViewById(R.id.title);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Taikhoan_Fragment()).commit();
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.taikhoan:
                        fragment = new Taikhoan_Fragment();

                        break;
                    case R.id.taoquangcao:
                        fragment = new Taoquangcao_Fragment();

                        break;
                    case R.id.thongbao:
                        fragment = new Thongbao_Fragment();

                        break;
                    case R.id.trogiup:
                        fragment = new Trogiup_Fragment();

                        break;

                    case R.id.caidat:
                        fragment = new Caidat_Fragment();

                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                return true;
            }
        });
    }
}