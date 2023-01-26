package com.example.myapp2.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.myapp2.R;
import com.example.myapp2.databinding.ActivityRoomsBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class RoomsActivity extends AppCompatActivity {
    private ActivityRoomsBinding binding;
    public ImageButton addroom;
    public Button room_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_rooms);

        getSupportActionBar().hide();
        binding = ActivityRoomsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.b_nav_rooms);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_statics, R.id.nav_route, R.id.nav_settings)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_fragment_bar);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.bNavRooms, navController);

        addroom = (ImageButton) findViewById(R.id.addroom);
        addroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoomsActivity.this, AddroomActivity.class);
                startActivity(intent);
            }
        });

        room_1 = (Button) findViewById(R.id.room_1);
        room_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoomsActivity.this, RoomsDevices.class);
                startActivity(intent);
            }
        });
    }
    public static final int LABEL_VISIBILITY_LABELED = 1;
}
