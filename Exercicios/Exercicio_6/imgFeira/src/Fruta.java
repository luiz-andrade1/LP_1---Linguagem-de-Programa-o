import java.util.Scanner;

public class Fruta {

    private String nome;
    private String tamanho;
    private String cor;
    private String origem;

    Scanner sc = new Scanner(System.in);

    public Fruta(String nome, String tamanho, String cor, String origem) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.origem = origem;
    }
    public Fruta(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {this.nome = nome;}

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {this.tamanho = tamanho;}

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {this.cor = cor;}

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {this.origem = origem;}

    public void addFruta(){
        System.out.println("Digite o nome da fruta que quer cadastrar:");
        nome = sc.nextLine();
        System.out.println("Digite o tamanho (Pequeno, Médio, Grande):");
        tamanho = sc.nextLine();
        System.out.println("Digite a cor:");
        cor = sc.nextLine();
        System.out.println("Digite sua origem (Árvore ou Arbusto):");
        origem = sc.nextLine();
    }
}