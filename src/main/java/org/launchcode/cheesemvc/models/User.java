package org.launchcode.cheesemvc.models;

public class User {

    private final String username;
    private String email;
    private String password;

    public User(String username) {
        this.username = username;
    }
}
