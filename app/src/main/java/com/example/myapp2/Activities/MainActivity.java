package com.example.myapp2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.myapp2.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainActivity extends AppCompatActivity {
    ImageView animlogo;
    Handler handler;
    int limit_time = 5;
    int count_time = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ImageView animLogoView = findViewById(R.id.animlogo);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        AnimationSet set = new AnimationSet(false);
        set.addAnimation(animation);
        animLogoView.startAnimation(set.getAnimations().get(0));

        handler = new Handler();
        timer.run();
    }

    Runnable timer = new Runnable() {
        @Override
        public void run() {
            count_time++;
                if (count_time == limit_time) {
                    Intent intent = new Intent(MainActivity.this, AuthActivity.class);
                    startActivity(intent);
                } else {
                    handler.postDelayed(timer, 1000);
                }
        }
    };
}