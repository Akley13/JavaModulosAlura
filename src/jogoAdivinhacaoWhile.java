import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacaoWhile {
    public static void main(String[] args) {
        Scanner entraDados = new Scanner(System.in);

        int tentativas = 0;
        int numPremiado = new Random().nextInt(10);
        int numDigitado;
        int contadorDeTentativas = 5;

        while (tentativas < 5) {
            tentativas++;

            System.out.println("TENTATIVAS: " + contadorDeTentativas);
            System.out.println("Número escolhido: ");
            numDigitado = entraDados.nextInt();

            if (numDigitado == numPremiado) {
                System.out.println("PARABÉNS, VOCÊ GANHOU!");
                break;
            }

            if (numDigitado > numPremiado){
                System.out.println("O número premiado é menor!");
                System.out.println();
            } else {
                System.out.println("O número premiado é maior!");
            }

            if (tentativas == 5){
                System.out.println("SINTO MUITO, VOCÊ PERDEU!");
                System.out.println("NÚMERO PREMIADO: " + numPremiado);
            }

            contadorDeTentativas -= 1;


        }



    }
}
