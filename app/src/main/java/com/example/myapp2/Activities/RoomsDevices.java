package com.example.myapp2.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.myapp2.R;
import com.example.myapp2.databinding.ActivityRoomsDevicesBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RoomsDevices extends AppCompatActivity {
    public ActivityRoomsDevicesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_rooms_devices);
        getSupportActionBar().hide();

        binding = ActivityRoomsDevicesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView2 = findViewById(R.id.b_nav_devices);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_light, R.id.nav_thermo)
                .build();

        NavController navController2 = Navigation.findNavController(this, R.id.nav_fragment_bar2);
        NavigationUI.setupActionBarWithNavController(this, navController2, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.bNavDevices, navController2);
    }
}