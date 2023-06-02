import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao2 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        int numDigitado = 0;
        int numPremiado = new Random().nextInt(10);

        System.out.println("JOGO DA ADIVINHAÇÃO - DESAFIO ALURA");
        System.out.println();

        System.out.println("Tente acertar o número premiado, você terá apenas 5 tentativas.");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("Contador: " + i);
            System.out.println("Número escolhido: ");
            numDigitado = inputData.nextInt();
            System.out.println();

            if (numDigitado == numPremiado) {
                System.out.println("PARABÉNS, VOCÊ GANHOU!");
                break;
            } else if (numDigitado > numPremiado) {
                System.out.println("O número premiado é menor!");
                System.out.println();
            } else {
                System.out.println("O número premiado é maior!");
                System.out.println();
            }
        }
    }
}
