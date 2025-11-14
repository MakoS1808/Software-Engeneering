package com.example.Controller;

import com.example.Model.Model;
import com.example.Model.Role;
import com.example.Model.Status;
import com.example.View.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(){
        this.model = new Model();
        this.view = new View();
    }
    
    public boolean handleLogin(String email, String password){
        return this.model.login(email, password);
    }

    public void handleRegistration(String email, String password, Role role) {
        model.createUser(role, email, password);
        view.displayUserCreation();
    }

    public void handleReceiptCreation(int amount, String userId) {
        model.createReceipt(amount, userId);

        view.displayReceipts(model.getAllReceipts());
        
    }

    public void handleStatusChange(String receiptId, Status status) {
        
    }
}
