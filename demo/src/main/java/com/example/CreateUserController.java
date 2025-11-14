package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class CreateUserController {
    @FXML
    private void createUser() throws IOException {
        App.setRoot("secondary");
    }
}
