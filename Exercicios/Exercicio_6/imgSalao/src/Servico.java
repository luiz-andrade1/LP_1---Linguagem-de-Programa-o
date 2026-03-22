import java.util.Scanner;

public class Servico {

    private String nome;
    private Double tempo;
    private Double valor;

    Scanner sc = new Scanner(System.in);

    public String getNome(){return nome;}
    public void setNome(){this.nome = nome;}
    public Double getTempo(){return tempo;}
    public void setTempo(){this.tempo = tempo;}
    public Double getValor(){return valor;}
    public void setValor(){this.valor = valor;}

    public Servico(){}
    public Servico(String nome, Double tempo, Double valor){
        this.nome = nome;
        this.tempo = tempo;
        this.valor = valor;
    }

    public void listarAtributos(){
        System.out.println("Descrição do Servico:");
        System.out.println(nome);
        System.out.println("Tempo: "+tempo+" horas");
        System.out.println("Valor: "+valor+" reais");
    }

    public void cadastrarServico(){
        System.out.println("Digite o nome do novo Servico:");
        nome = sc.next();
        System.out.println("Digite o tempo estimado do Servico:");
        tempo = sc.nextDouble();
        System.out.println("Digite o valor do Servico:");
        valor = sc.nextDouble();
    }



}
