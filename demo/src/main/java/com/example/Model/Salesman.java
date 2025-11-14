package com.example.Model;
import java.util.ArrayList;

public class Salesman implements User {
    private String id;
    private Role role;
    private String email;
    private String password;
    private ArrayList<String> receipts;

    public Salesman(String id, Role role, String email, String password) {
        this.id = id;
        this.role = role;
        this.email = email;
        this.password = password;
        this.receipts = new ArrayList<String>();
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

    public ArrayList<String> getReceipt() {
        throw new UnsupportedOperationException(":p");
    }

    public void addReceipt(String receiptId) {
        
        receipts.add(receiptId);
    }
    
}
