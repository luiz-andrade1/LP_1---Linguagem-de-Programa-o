package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Alimento {

    private String nome;
    private Double peso;
    private Double valor;

    public Alimento(String nome, Double peso, Double valor){
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public Alimento(){}

    public String getNome() {return nome;}
    public void setNome() {this.nome = nome;}

    public Double getPeso(){return peso;}
    public void setPeso(){this.peso = peso;}

    public Double getValor(){return valor;}
    public void setValor(){this.valor = valor;}

    public String mostrarVenceu(){return (getNome()+" passou da data de validade!");}

    public String mostrarValor(){
        return("Esse alimento custa "+String.valueOf(getValor())+" reais.");
    }

    public String mostrarPeso(){
        return(getNome()+" pesa "+String.valueOf(getPeso())+" gramas.");
    }
}
