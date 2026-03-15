import java.util.Scanner;

public class Farmacia {

    public int numero;
    Scanner sc = new Scanner(System.in);

    public void main() {

        System.out.println("BEM-VINDO À FARMÁCIA!\nIndique qual produto gostaria de buscar informações:\n1. Remedio\n2. Cosmetico\n3. Alimento");
        numero = sc.nextInt();

        if (numero == 1) {

            System.out.println("Para remedio PARACETAMOL, busque informações:");
            System.out.println("1 - para saber a posologia\n2 - para saber a quantidade\n3 - para saber os efeitos colaterais");
            numero = sc.nextInt();

            Remedio remedio = new Remedio();

            if (numero == 1) {
                remedio.callPosologia();
            }
            if (numero == 2) {
                remedio.callQuantidade();
            }
            if (numero == 3) {
                remedio.callEfeitos();
            }
        }
        if (numero == 2){

            System.out.println("Para cosmetico CREME FACIAL, busque informações:");
            System.out.println("1 - para saber a aplicação recomendada\n2 - para saber a quantidade\n3 - para saber a dosagem recomendada");
            numero = sc.nextInt();

            Cosmetico cosmetico = new Cosmetico();

            if (numero == 1){
                cosmetico.callAplicacao();
            }
            if (numero == 2){
                cosmetico.callQuantidade();
            }
            if (numero == 3){
                cosmetico.callDosagem();
            }
        }
        if (numero == 3){

            System.out.println("para alimento BARRA DE CEREAL, busque informações:");
            System.out.println("1 - para saber o sabor predominante\n2 - para saber o tipo\n3 - para saber a quantidade");
            numero = sc.nextInt();

            Alimento alimento = new Alimento();

            if(numero == 1){
                alimento.callSabor();
            }
            if (numero == 2){
                alimento.callTipo();
            }
            if(numero == 3){
                alimento.callQuantidade();
            }
        }
    }
}