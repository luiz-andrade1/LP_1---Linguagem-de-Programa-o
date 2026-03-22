import java.util.Scanner;

public class Funcionario {

    private String nome;
    private String funcao;
    private Integer tempoCasa;

    Scanner sc = new Scanner(System.in);

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome=nome;
    }
    public String getFuncao(){
        return funcao;
    }
    public void setFuncao(){
        this.funcao = funcao;
    }
    public Integer getTempoCasa(){
        return tempoCasa;
    }
    public void setTempoCasa(){
        this.tempoCasa = tempoCasa;
    }

    public Funcionario(){}

    public Funcionario(String nome, String funcao, Integer tempoCasa){
        this.nome = nome;
        this.funcao = funcao;
        this.tempoCasa = tempoCasa;
    }

   public void listarAtributos(){
       System.out.println("Descrição do funcionário:");
       System.out.println(nome);
       System.out.println("Função: "+funcao);
       System.out.println("Esse funcionário está a "+tempoCasa+" anos do Salão");
   }

   public void cadastrarFuncionario(){
       System.out.println("Digite o nome do novo funcionário:");
       nome = sc.next();
       System.out.println("Digite qual será a funcão:");
       funcao = sc.next();
       System.out.println("Digite quanto tempo a pessoa trabalha na empresa\n(Digite '0' se for recém contratado)");
       tempoCasa = sc.nextInt();
    }

}
