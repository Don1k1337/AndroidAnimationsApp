package com.example.androidanimationsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView text;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btn);
        text = (TextView)findViewById(R.id.txt);
        img = (ImageView)findViewById(R.id.img);

        img.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomin);
            img.startAnimation(animation);
        });

        text.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
            text.startAnimation(animation);
        });

        btn.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
            btn.startAnimation(animation);
        });
    }
}