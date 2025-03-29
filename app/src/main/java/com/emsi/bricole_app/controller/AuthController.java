package com.emsi.bricole_app.controller;

public class AuthController {
    public static boolean login(String email, String password) {
        // Mock authentication (Replace with Firebase or SQLite)
        return email.equals("test@example.com") && password.equals("1234");
    }
}
