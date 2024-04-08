package com.example.emissiontestkit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onHomeClicked(View view) {
        // Handle emission LinearLayout click here
        Intent intent = new Intent(SettingsActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    public void onEmissionClicked(View view) {
        // Handle history LinearLayout click here
        Intent intent = new Intent(SettingsActivity.this, EmissionActivity.class);
        startActivity(intent);
    }

    public void onHistoryClicked(View view) {
        // Handle settings LinearLayout click here
        Intent intent = new Intent(SettingsActivity.this, HistoryActivity.class);
        startActivity(intent);
    }

}