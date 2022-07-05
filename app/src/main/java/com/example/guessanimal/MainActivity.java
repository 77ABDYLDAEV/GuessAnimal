package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.guessanimal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    boolean isCat,isDog,isHorse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClickers();


    }

    private void initClickers() {
        binding.catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.animalImg.setImageResource(R.drawable.cat);
                isCat = true;
            }
        });
        binding.dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.animalImg.setImageResource(R.drawable.dog);
                isDog = true;
            }
        });
        binding.horseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.animalImg.setImageResource(R.drawable.horse);
                isHorse = true;
            }
        });
        binding.thatCatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCat){
                    Toast.makeText(MainActivity.this, "Да это кошка", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, " это не кошка", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.thatDogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDog){
                    Toast.makeText(MainActivity.this, "Да это собака", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, " это не собака", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.thatHorseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isHorse){
                    Toast.makeText(MainActivity.this, "Да это лошадка", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, " это не лошадка", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("key","Привет мир!");
                startActivity(intent);

            }
        });
    }

}