package com.example.myapp2.Fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.myapp2.Activities.AddroomActivity;
import com.example.myapp2.Activities.MapActivity;
import com.example.myapp2.Activities.RoomsActivity;
import com.example.myapp2.R;

public class HomeFragment extends Fragment {
    public Button geo_btn;
    public ImageButton addroom;
    public Button edit_1;

   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}