import java.util.Scanner;

public class LoopFor2 {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        System.out.println("Qual o nome do jogo que você quer avaliar?");
        String jogo = lerDados.nextLine();


        for (int i = 0; i < 3; i++) {

            System.out.println();
            System.out.println("Contador: " + i);
            System.out.println("Avaliação do jogo: ");
            nota = lerDados.nextDouble();
            mediaAvaliacao += nota;
        }

        mediaAvaliacao /= 3;

        if (mediaAvaliacao >= 6){
            System.out.printf("%s | Acima da média: %.2f | APROVADO! ", jogo, mediaAvaliacao);
        } else {
            System.out.printf("%s | Abaixo da média: %.2f | REPROVADO", jogo, mediaAvaliacao);
        }
    }
}
