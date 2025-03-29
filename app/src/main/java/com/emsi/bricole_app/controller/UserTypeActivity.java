package com.emsi.bricole_app.controller;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.emsi.bricole_app.R;

public class UserTypeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type);

        findViewById(R.id.btnEmployer).setOnClickListener(view -> openSignupScreen());
        findViewById(R.id.btnJobSeeker).setOnClickListener(view -> openSignupScreen());
    }

    private void openSignupScreen() {
        startActivity(new Intent(this, SignupActivity.class));
    }
}

