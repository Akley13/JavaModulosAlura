import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner inserirDados = new Scanner(System.in);

        double valorTransferido = 0;

        System.out.println("\nNOME COMPLETO | CPF | OUTRAS CHAVES PIX: ");
        String nomePessoa = inserirDados.nextLine();

        System.out.println("\nValor a ser transferido: ");
        valorTransferido = inserirDados.nextDouble();

        System.out.printf("\nTransferência realizada para %s | Saldo atual R$ ", nomePessoa);

    }
}
