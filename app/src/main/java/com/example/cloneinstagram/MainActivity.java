package com.example.cloneinstagram;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;

import com.example.cloneinstagram.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private NavController controller;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        initViews();
        openMainFragment();
    }

    private void openMainFragment() {
        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_main:
                        openMainFragment();
                        break;
                    case R.id.item_search:
                        Toast.makeText(MainActivity.this, "Item explore", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_add:
                        Toast.makeText(MainActivity.this, "Item ADD", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_notification:
                        Toast.makeText(MainActivity.this, "Item likes", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_profile:
                        Toast.makeText(MainActivity.this, "Item profile", Toast.LENGTH_SHORT).show();
                        break;

                }
                return false;
            }
        });
    }

    private void initViews() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container,new MainFragment());
        transaction.commit();
    }
}