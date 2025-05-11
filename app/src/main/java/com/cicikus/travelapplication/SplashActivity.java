package com.cicikus.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.cicikus.travelapplication.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
private ActivitySplashBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
       binding = ActivitySplashBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());

       binding.startBtn.setOnClickListener(v -> startActivity(new Intent(SplashActivity.this,MainActivity.class)));
    }
}