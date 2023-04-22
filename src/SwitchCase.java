import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int sorvete = 1;

        switch (sorvete) {
            case 1:
                System.out.println("Morango");
                break;

            case 2:
                System.out.println("Limão");
                break;

            case 3:
                System.out.println("Chocolate");
                break;

            case 4:
                System.out.println("Maracujá");
                break;

            default:
                System.out.println("Infelizmente não temos esse sabor.");
                break;
        }

        System.out.println("");

    }
}

