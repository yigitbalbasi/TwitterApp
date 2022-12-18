package com.yigitb.twitterappui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.yigitb.twitterappui.databinding.ActivityMainBinding;
import com.yigitb.twitterappui.ui.fragment.AnasayfaFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    BottomNavigationView bottomNavigationView;

    AnasayfaFragment anasayfaFragment = new AnasayfaFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        bottomNavigationView=findViewById(R.id.bottom_navigation);


    }
}