import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner inputDados = new Scanner(System.in);

        double notaDofilme = 0;
        double mediaAvaliacao = 0;
        int contador = 1;

        while (notaDofilme != -1) {
            System.out.println("Contador: " + contador++);

            System.out.println("Nota dos filmes: ");
            notaDofilme = inputDados.nextDouble();
        }

        System.out.printf("Média da avaliação: %.2f",mediaAvaliacao / contador);

    }
}
