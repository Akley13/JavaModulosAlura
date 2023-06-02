import java.util.Scanner;

public class LoopWhile2 {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int contadorDeNotas = 0;

        System.out.println("Qual o nome do jogo que você quer avaliar?");
        String jogo = lerDados.nextLine();

        while (nota != -1) {
            System.out.println();
            System.out.println("Contador: " + contadorDeNotas);
            System.out.println("Avaliação do jogo: ");
            nota = lerDados.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                contadorDeNotas++;
            }
        }

        System.out.printf("%s | Média total: %.2f",jogo, mediaAvaliacao / contadorDeNotas);
    }
}
