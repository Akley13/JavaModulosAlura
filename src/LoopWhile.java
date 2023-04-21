import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner inputDados = new Scanner(System.in);

        double notaDofilme = 1;
        double mediaAvaliacao = 0;
        int contador = 0;

        while (notaDofilme != -1) {

            System.out.println("Nota dos filmes: ");
            notaDofilme = inputDados.nextDouble();

            if (notaDofilme != -1) {
                mediaAvaliacao += notaDofilme;
                contador++;
            }
        }

        System.out.printf("Média da avaliação: %.2f",mediaAvaliacao / contador);

    }
}
