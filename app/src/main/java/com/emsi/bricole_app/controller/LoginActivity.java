package com.emsi.bricole_app.controller;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.emsi.bricole_app.R;
import com.emsi.bricole_app.controller.AuthController;

public class LoginActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        findViewById(R.id.btnLogin).setOnClickListener(view -> loginUser());
    }

    private void loginUser() {
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        if (AuthController.login(email, password)) {
            Toast.makeText(this, "Connexion réussie!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Échec de connexion", Toast.LENGTH_SHORT).show();
        }
    }
}

