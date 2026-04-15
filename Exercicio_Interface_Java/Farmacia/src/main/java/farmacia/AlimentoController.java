package farmacia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
        alimento = new Alimento (txtNome.getText(), Integer.parseInt(txtPeso.getText()), Double.parseDouble(txtValor.getText()));
        String sql = "INSERT INTO alimento (nome, peso, valor) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, alimento.getNome());
            stmt.setInt(2, alimento.getPeso());
            stmt.setDouble(3, alimento.getValor());
            stmt.executeUpdate();
            System.out.println("Salvo no banco com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao salvar no banco: " + e.getMessage());
        }
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

