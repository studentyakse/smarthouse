package com.example.myapp2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp2.R;

public class NewResidentActivity extends AppCompatActivity {
    Button enterYourHouse;
    Button newResident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_newresident);

        enterYourHouse = (Button) findViewById(R.id.enterYourHouse2);
        newResident = (Button) findViewById(R.id.newResident2);

        enterYourHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewResidentActivity.this, AuthActivity.class);
                startActivity(intent);
            }
        });

        newResident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewResidentActivity.this, RoomsActivity.class);
                startActivity(intent);
            }
        });
    }
}