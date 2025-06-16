package com.example.secondactivity;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnFinish = findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(v -> finish()); // ends this activity
    }
}
