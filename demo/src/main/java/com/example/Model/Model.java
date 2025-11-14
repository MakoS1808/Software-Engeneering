package com.example.Model;

import java.util.HashMap;
import java.util.UUID;

public class Model {
    private HashMap<String, User> users;
    private HashMap<String, Receipt> receipts;
    private String currentUser;

    public Model(){
        this.users = new HashMap<>();
        this.receipts = new HashMap<>();
    }

    public HashMap<String, Receipt> getAllReceipts(){
        return this.receipts;
    }

    public Receipt getReceipt(String id){
        return receipts.get(id);
    }

    public HashMap<String, User> gatAllUsers(){
        return this.users;
    }

    public User getUser(String id) {
        return users.get(id);
    }

    public String getCurrent() {
        return this.currentUser;
    }

    public void createReceipt(int amount, String userId){
        String id = UUID.randomUUID().toString();

        Receipt receipt = new Receipt(id, amount);

        users.get(id);

        receipts.put(id, receipt);   
    }

    public void createUser(Role role, String email, String password) {
        String id = UUID.randomUUID().toString();

        User newUser;
        if (role == Role.SALESMAN) {
            newUser = new Salesman(id, role, email, password);
        }
        else {
            newUser = new GeneralUser(id, role, email, password);
        }

        users.put(id, newUser); 
    }

    public boolean login(String email, String password){
        for (User u : users.values()) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                this.currentUser = u.getID();
                return true;
            }
        }
        return false;
     }
}
