import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        int numeroPremiado = new Random().nextInt(40);
        int tentativas = 5;
        int numeroDigitado;

        System.out.println("Neste jogo você tem que adivinhar o número premiado, ele está entre 0 e 40. BOA SORTE!");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("Tentativas: " + tentativas);
            System.out.println("Tente acertar o  número premiado!");

            System.out.println();

            System.out.println("Número: ");
            numeroDigitado = inputData.nextInt();

            if (numeroDigitado == numeroPremiado) {
                System.out.println("------------------------------");
                System.out.println("   PARABÉNS, VOCÊ GANHOU!!!   ");
                System.out.println("------------------------------");
                break;
            }

            if (numeroDigitado < numeroPremiado){
                System.out.println("O número premiado é maior que este número!");
            } else {
                System.out.println("O número premiado é menor que este número!");
            }

            tentativas -= 1;

            System.out.println();
        }

        if (tentativas == 0) {
            System.out.println("NÚMERO PREMIADO: " + numeroPremiado);
            System.out.println();
            System.out.println("SINTO MUITO, VOCÊ PERDEU!");
        }

    }
}
