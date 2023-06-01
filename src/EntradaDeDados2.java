import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        System.out.println("Qual seu jogo favorito?");
        String jogo = lerDados.nextLine();

        System.out.println("E o ano de seu lançamento?");
        int anoDeLancamento = lerDados.nextInt();

        System.out.println("Para finalizar, dê sua nota para este jogasso!");
        double nota = lerDados.nextDouble();

        System.out.printf("Jogo favorito: %s", jogo);
        System.out.println();
        System.out.printf("Ano de lançamento: %d", anoDeLancamento);
        System.out.println();
        System.out.printf("Nota: %.2f", nota);
    }
}
