package com.example.myhelloworld;

public class User {

    private String message;

    public User(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
}
