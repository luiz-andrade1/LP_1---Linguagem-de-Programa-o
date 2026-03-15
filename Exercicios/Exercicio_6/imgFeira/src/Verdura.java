import java.util.Scanner;

public class Verdura {

    private String nome;
    private String intensidade;
    private String tamanhoFolha;
    private String consumo;

    Scanner sc = new Scanner(System.in);

    public Verdura(String nome, String intensidade, String tamanhoFolha, String consumo){
        this.nome = nome;
        this.intensidade = intensidade;
        this.tamanhoFolha = tamanhoFolha;
        this.consumo = consumo;
    }
    public Verdura(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {this.nome = nome;}

    public String getIntensidade() {
        return intensidade;
    }
    public void setIntensidade(String intensidade) {this.intensidade = intensidade;}

    public String getTamanhoFolha() {
        return tamanhoFolha;
    }
    public void setTamanhoFolha(String tamanhoFolha) {this.tamanhoFolha = tamanhoFolha;}

    public String getConsumo() {
        return consumo;
    }
    public void setConsumo(String consumo) {this.consumo = consumo;}

     public void addVerdura(){
         System.out.println("Digite o nome da verdura:");
         nome = sc.nextLine();
         System.out.println("Digite a intensidade do verde (Claro, Médio ou Escuro):");
         intensidade = sc.nextLine();
         System.out.println("Digite o tamanho da folha (Pequena, Média, Grande)");
         tamanhoFolha = sc.nextLine();
         System.out.println("Digite a forma de consumo (Cozido ou Cru):");
         consumo = sc.nextLine();
     }

}

