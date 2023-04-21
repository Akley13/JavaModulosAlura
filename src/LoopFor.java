import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner inputDados = new Scanner(System.in);

        double notaDoFilme = 0;
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nota do filme: ");
            notaDoFilme = inputDados.nextDouble();
            //mediaDosAlunos = mediaDosAlunos + notaDosAlunos; (OUTRO MODO)
            mediaAvaliacao += notaDoFilme;
        }

        System.out.printf("Média da avaliação: %.2f",mediaAvaliacao/3);
    }
}
