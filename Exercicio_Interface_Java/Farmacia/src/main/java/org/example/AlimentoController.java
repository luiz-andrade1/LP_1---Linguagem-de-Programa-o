package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AlimentoController {

    Alimento alimento;

    @FXML
    private Button btCadastro;

    @FXML
    private Button btVoltar;

    @FXML
    private Button btPeso;

    @FXML
    private Button btValor;

    @FXML
    private Button btVencimento;

    @FXML
    private Label lbTexto;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtValor;

    @FXML
    void cadAlimento(ActionEvent event) {
        alimento = new Alimento(txtNome.getText(), Double.parseDouble(txtPeso.getText()), Double.parseDouble(txtValor.getText()));
        txtNome.clear();
        txtPeso.clear();
        txtValor.clear();
    }

    @FXML
    void mostrarPeso(ActionEvent event) {lbTexto.setText(alimento.mostrarPeso());}

    @FXML
    void mostrarValor(ActionEvent event) {lbTexto.setText(alimento.mostrarValor());}

    @FXML
    void mostrarVenceu(ActionEvent event) {
        lbTexto.setText(alimento.mostrarVenceu());
    }

    @FXML
    private void switchToFarmacia() throws IOException {
        App.setRoot("farmacia");}


}

