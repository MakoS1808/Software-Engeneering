package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class homePageController {
    
    @FXML
    private void switchToCreateUser() throws IOException {
        App.setRoot("createUser");
    }

    @FXML
    private void switchToDisplayReceipt() throws IOException {
        App.setRoot("displayReceipts");
    }

    @FXML
    private void switchToDisplayUsers() throws IOException {
        App.setRoot("displayUsers");
    }

    }

