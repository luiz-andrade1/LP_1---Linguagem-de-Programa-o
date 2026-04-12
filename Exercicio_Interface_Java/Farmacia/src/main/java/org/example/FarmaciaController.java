package org.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Button;

public class FarmaciaController {

    @FXML
    private Button btAlimento;

    @FXML
    private Button btCosmetico;

    @FXML
    private Button btRemedio;

    @FXML
    private void switchToRemedio() throws IOException {
        App.setRoot("remedio");}

    @FXML
    private void switchToCosmetico() throws IOException {
        App.setRoot("cosmetico");}

    @FXML
    private void switchToAlimento() throws IOException {
        App.setRoot("alimento");}

}
