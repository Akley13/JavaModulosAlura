import java.util.Scanner;

public class LeituraDoUsuario {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("Me conte, qual é seu filme favorito? ");
        String filme = inputData.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoLancamento = inputData.nextInt();

        System.out.println("Filme favorito: " + filme + " | " + "Ano de lançamento: " + anoLancamento);
    }
}
