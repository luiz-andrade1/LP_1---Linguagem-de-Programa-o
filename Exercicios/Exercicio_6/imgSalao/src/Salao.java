import java.util.Scanner;

public class Salao {

    private Integer opcao;

    Scanner sc = new Scanner(System.in);

    public void main() {

        System.out.println("BEM-VINDO AO SISTEMA TOTVS!");
        System.out.println("---------------------------");
        System.out.println("OPÇÕES:\n1 - FUNCIONÁRIO\n2 - CLIENTE\n3 - SERVIÇO");
        opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("OPÇÕES:\n1 - Pesquisar Funcionário\n2 - Cadastrar Funcionário");
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("Digite qual é o funcionário ao qual deseja saber mais informações:");
                System.out.println("1 - Luciano\n2 - Luiz\n3 - Carol");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    Funcionario funcionario = new Funcionario("Luciano", "Cabelereiro", 10);
                    funcionario.listarAtributos();
                }
                if (opcao == 2) {
                    Funcionario funcionario = new Funcionario("Luiz", "Lavador", 5);
                    funcionario.listarAtributos();
                }
                if (opcao == 3) {
                    Funcionario funcionario = new Funcionario("Carol", "Manicure", 8);
                    funcionario.listarAtributos();
                }
            }

            if (opcao == 2) {

                Funcionario funcionario = new Funcionario();
                funcionario.cadastrarFuncionario();

                System.out.println("Digite '1' para finalizar o Cadastro\nDigite '2' para conferir as informações");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("CADASTRO FINALIZADO COM SUCESSO!");
                }
                if (opcao == 2) {
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("Função: " + funcionario.getFuncao());
                    System.out.println("Tempo de casa: " + funcionario.getTempoCasa());
                }
            }
        }

        if (opcao == 2) {
            System.out.println("OPÇÕES:\n1 - Pesquisar Cliente\n2 - Cadastrar Cliente");
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("Digite qual o cliente ao qual deseja saber mais informações:");
                System.out.println("1 - Vanessa\n2 - Lucas\n3 - Floriano");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    Cliente cliente = new Cliente("Vanessa", 18, "Feminino");
                    cliente.listarAtributos();
                }
                if (opcao == 2) {
                    Cliente cliente = new Cliente("Lucas", 34, "Masculino");
                    cliente.listarAtributos();
                }
                if (opcao == 3) {
                    Cliente cliente = new Cliente("Floriano", 56, "Masculino");
                    cliente.listarAtributos();
                }
            }

            if (opcao == 2) {

                Cliente cliente = new Cliente();
                cliente.cadastrarCliente();

                System.out.println("Digite '1' para finalizar o Cadastro\nDigite '2' para conferir as informações");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("CADASTRO FINALIZADO COM SUCESSO!");
                }
                if (opcao == 2) {
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("Idade: " + cliente.getIdade());
                    System.out.println("Gênero: " + cliente.getGenero());
                }
            }
        }
        if (opcao == 3) {
            System.out.println("OPÇÕES:\n1 - Pesquisar Serviço\n2 - Cadastrar Serviço");
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("Digite qual o serviço ao qual deseja saber mais informações:");
                System.out.println("1 - Lavagem\n2 - Corte\n3 - Pintura");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    Servico servico = new Servico("Lavagem", 0.30, 20.00);
                    servico.listarAtributos();
                }
                if (opcao == 2) {
                    Servico servico = new Servico("Corte", 1.00, 70.00);
                    servico.listarAtributos();
                }
                if (opcao == 3) {
                    Servico servico = new Servico("Pintura", 2.00, 100.00);
                    servico.listarAtributos();
                }
            }

            if (opcao == 2) {

                Servico servico = new Servico();
                servico.cadastrarServico();

                System.out.println("Digite '1' para finalizar o Cadastro\nDigite '2' para conferir as informações");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("CADASTRO FINALIZADO COM SUCESSO!");
                }
                if (opcao == 2) {
                    System.out.println("Nome: " + servico.getNome());
                    System.out.println("Tempo: " + servico.getTempo());
                    System.out.println("Valor: " + servico.getValor());
                }
            }

        }
    }
}
