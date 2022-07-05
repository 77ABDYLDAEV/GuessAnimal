package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.guessanimal.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getValue();
    }

    private void getValue() {
        String somevalue;
        Intent intent = getIntent();
        somevalue = intent.getStringExtra("key");
        binding.resultTv.setText(somevalue);
    }
}