import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("Me conte, qual é seu filme favorito? ");
        String filme = inputData.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int anoLancamento = inputData.nextInt();

        System.out.println("E que nota você daria para ele?");
        double nota = inputData.nextDouble();

        System.out.println("---------------------------------------------------------------");
        System.out.println("Filme favorito: " + filme + " | " + "Ano de lançamento: " + anoLancamento + " | " + "Nota: " + nota);
        System.out.println("---------------------------------------------------------------");

    }
}
