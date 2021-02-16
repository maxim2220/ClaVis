package com.ClaVis.clavis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private Activity2_2fragment fragment2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.Mytobbar);
        setActionBar(toolbar);
        fragment2 = new  Activity2_2fragment();
        BottomNavigationView navigationView = findViewById(R.id.bottomNavigationViewSyn);
        navigationView.setOnNavigationItemSelectedListener((MenuItem item) -> {
            item.getItemId();
            switch (item.getItemId()){
                case R.id.roma:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fl_menukama, fragment2).commit();
                    break;
                case R.id.maxon:
                    getSupportFragmentManager().beginTransaction().remove(fragment2).commit();
                    break;
            }
            return true;
        });
    }
}