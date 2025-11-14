package com.example;

import java.io.IOException;

import com.example.Controller.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    private Controller cont;

    public void setCont(Controller controller) {
        this.cont = controller;
    }

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        System.out.println("Attempt login with " + email + " / " + password);

        boolean approved = cont.handleLogin(email, password);

        if (approved) {
            System.out.println("Login succesful");
            App.setRoot("homePage");
        } else {
            System.out.println("Login failed");
        }
        
    }
}

