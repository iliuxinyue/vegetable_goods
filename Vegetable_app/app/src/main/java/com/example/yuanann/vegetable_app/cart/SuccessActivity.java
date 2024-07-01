package com.example.yuanann.vegetable_app.cart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.yuanann.vegetable_app.Home;
import com.example.yuanann.vegetable_app.Index;
import com.example.yuanann.vegetable_app.R;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {

    private TextView back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        back_home = findViewById(R.id.back_home);

        back_home.setOnClickListener(v -> {
            startActivity(new Intent(this, Home.class));
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            finish();
        });
    }
}
