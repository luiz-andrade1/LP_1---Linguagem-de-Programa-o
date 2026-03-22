import java.util.Scanner;

public class Cliente {

    private String nome;
    private Integer idade;
    private String genero;

    Scanner sc = new Scanner(System.in);

    public String getNome(){return nome;}
    public void setNome(){this.nome = nome;}
    public Integer getIdade(){return idade;}
    public void setIdade(){this.idade = idade;}
    public String getGenero(){return genero;}
    public void setGenero(){this.genero = genero;}

    public Cliente(){}
    public Cliente(String nome, Integer idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void listarAtributos(){
        System.out.println("Descrição do Cliente:");
        System.out.println(nome);
        System.out.println("Idade: "+idade);
        System.out.println("Gênero: "+genero);
    }

    public void cadastrarCliente(){
        System.out.println("Digite o nome do novo Cliente:");
        nome = sc.next();
        System.out.println("Digite a idade do Cliente:");
        idade = sc.nextInt();
        System.out.println("Digite o gênero do Cliente:");
        genero = sc.next();
    }



}
