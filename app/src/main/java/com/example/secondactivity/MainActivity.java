package com.example.secondactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ----- EXPLICIT INTENT -----
        Button btnOpenSecond = findViewById(R.id.btnOpenSecond);
        btnOpenSecond.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        // ----- IMPLICIT INTENT -----
        Button btnImplicit = findViewById(R.id.btnImplicit);
        btnImplicit.setOnClickListener(v -> {
            // Option A: dialer with number pre‑filled (safer than CALL_PHONE)
            Intent dialIntent =
                    new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"));
            // Option B (browser) would be:
            // Intent webIntent = new Intent(Intent.ACTION_VIEW,
            //                               Uri.parse("http://www.google.com"));
            startActivity(dialIntent);
        });
    }
}