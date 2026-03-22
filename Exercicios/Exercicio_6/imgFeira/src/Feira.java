import java.util.Objects;
import java.util.Scanner;

public class Feira {


    public void main() {

        Integer opcao;
        Scanner sc = new Scanner(System.in);
        String confirmacao;

        System.out.println("BEM-VINDO À FEIRA!\nDigite qual alimento gostaria de cadastrar:\n1. Fruta\n2. Legume\n3. Verdura");
        opcao = sc.nextInt();

        do {
            if (opcao == 1) {
                Fruta addFrutas = new Fruta();
                addFrutas.addFruta();

                System.out.println("Digite SIM para conferir as informações e confirmar o cadastro.");
                confirmacao = sc.next();

                if (Objects.equals(confirmacao, "SIM")) {
                    System.out.println("Nome: " + addFrutas.getNome());
                    System.out.println("Tamanho: " + addFrutas.getTamanho());
                    System.out.println("Cor: " + addFrutas.getCor());
                    System.out.println("Origem: " + addFrutas.getOrigem());
                    System.out.println("Cadastro Finalizado com sucesso!");
                } else {
                    System.out.println("Processo finalizado.");
                }
            }
            if (opcao == 2) {
                Legume addLegumes = new Legume();
                addLegumes.addLegume();

                System.out.println("Digite SIM para conferir as informações e confirmar o cadastro.");
                confirmacao = sc.next();

                if (Objects.equals(confirmacao, "SIM")) {
                    System.out.println("Nome: " + addLegumes.getNome());
                    System.out.println("Tamanho: " + addLegumes.getTamanho());
                    System.out.println("Cor: " + addLegumes.getCor());
                    System.out.println("Origem: " + addLegumes.getOrigem());
                    System.out.println("Cadastro Finalizado com sucesso!");
                } else {
                    System.out.println("Processo finalizado.");
                }
            }
            if (opcao == 3) {
                Verdura addVerduras = new Verdura();
                addVerduras.addVerdura();

                System.out.println("Digite SIM para conferir as informações e confirmar o cadastro.");
                confirmacao = sc.next();

                if (Objects.equals(confirmacao, "SIM")) {
                    System.out.println("Nome: " + addVerduras.getNome());
                    System.out.println("Intensidade do verde: " + addVerduras.getIntensidade());
                    System.out.println("Folha: " + addVerduras.getTamanhoFolha());
                    System.out.println("Consumo: " + addVerduras.getConsumo());
                    System.out.println("Cadastro Finalizado com sucesso!");
                } else {
                    System.out.println("Processo finalizado.");
                }
            }
        } while (opcao >1);
    }
}