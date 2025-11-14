package com.example.Model;

public class GeneralUser implements User {
    private String id;
    private Role role;
    private String email;
    private String password;

    public GeneralUser(String id, Role role, String email, String password) {
        this.id = id;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    @Override
    public Role getRole() {
        return this.role;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getEmail() {    
        return this.email;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    
}