import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        System.out.println("Qual seu jogo favorito?");
        String jogo = lerDados.nextLine();

        System.out.println("Jogo favorito: " + jogo);
    }
}
