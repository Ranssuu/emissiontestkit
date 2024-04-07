package com.example.emissiontestkit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_history);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void onHomeClicked(View view) {
        // Handle emission LinearLayout click here
        Intent intent = new Intent(HistoryActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    public void onEmissionClicked(View view) {
        // Handle emission LinearLayout click here
        Intent intent = new Intent(HistoryActivity.this, EmissionActivity.class);
        startActivity(intent);
    }
    public void onSettingsClicked(View view) {
        // Handle emission LinearLayout click here
        Intent intent = new Intent(HistoryActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
}