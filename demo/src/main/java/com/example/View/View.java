package com.example.View;

import java.util.HashMap;
import com.example.Model.Receipt;
import com.example.Model.User;

public class View {
    public void displayReceipts(HashMap<String, Receipt> receipts){
       for (Receipt r : receipts.values()) {
        displayReceipt(r);
       } 
    }

    public void displayReceipt(Receipt receipt){
        System.out.println("This aint implemented :,c"); 
    }

    public void displayLogin(){
        System.out.println("This aint implemented :,c"); 
    }

    public void displayUserCreation() {
        System.out.println("This aint implemented :,c");
    }

    public void printUserDetails(User user){
        System.out.println("This aint implemented :,c");
    }

    public void printUsers(HashMap<String, User> users){
        for (User u : users.values()) {
        printUserDetails(u);
        }
    }
}