import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Digite o número relacionado ao sabor de sua escolha.");
        System.out.println();

        System.out.println("SABORES");
        System.out.println();

        System.out.println("1 - Morango");
        System.out.println("2 - Limão");
        System.out.println("3 - Chocolate");
        System.out.println("4 - Maracujá");
        System.out.println("0 - Cancelar operação.");


        int sorvete = entradaDeDados.nextInt();

        switch (sorvete) {
            case 0:
                System.out.println("Operação cancelada.");
                break;

            case 1:
                System.out.println("Sorvete sabor Morango");
                break;

            case 2:
                System.out.println("Sorvete sabor Limão");
                break;

            case 3:
                System.out.println("Sorvete sabor Chocolate");
                break;

            case 4:
                System.out.println("Sorvete sabor Maracujá");
                break;

            default:
                System.out.println("Infelizmente não temos esse sabor.");
                break;
        }
    }
}

