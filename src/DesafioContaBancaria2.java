import java.util.Scanner;
public class DesafioContaBancaria2 {
    public static void main(String[] args) {
        Scanner inserirDados = new Scanner(System.in);

        // Váriáveis utilizadas
        int operacao = 0;
        double valorTransferido;
        double deposito;

        System.out.println("\nXXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");

        System.out.println("\n-------------- CADASTRO DE CLIENTE ----------------");

        System.out.println("\nNome Completo: ");
        String nome = inserirDados.nextLine();

        System.out.println("CPF: ");
        String cpf = inserirDados.nextLine();

        System.out.println("Saldo inicial: ");
        double saldo = inserirDados.nextInt();

        System.out.println("\n-------------- CLIENTE CADASTRADO -----------------");

        System.out.println("\nNome completo: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo inicial R$ " + saldo);

        System.out.println("\n------------------- OPERAÇÕES ---------------------");

        System.out.println("\nSELECIONE A OPÇÃO DESEJADA:");

        // Laço de repetição
        while (operacao != 4) {

            String menu = """
                    \n1- Consultar saldo
                    2- Receber depósito
                    3- Transferir valor
                    4- Encerrar operação
                          """;

            System.out.println(menu);

            System.out.println("\nOPÇÃO: ");
            operacao = inserirDados.nextInt();

            if (operacao > 4){
                System.out.println("\nOpção Inválida!");
            }

            // Condicional
            switch (operacao){
                case 1 -> System.out.println("\nSaldo atual R$ " + saldo);

                case 2 -> {
                    System.out.println("\nValor do depósito: ");
                    deposito = inserirDados.nextDouble();

                    saldo += deposito;

                    System.out.println("\nDepósito realizado | Saldo atual R$ " + saldo);
                }

                case 3 -> {
                    System.out.println("\n---------------- DADOS DO REMETENTE -----------------");

                    System.out.println("\nNOME COMPLETO | CPF | OUTRAS CHAVES PIX: ");
                    String remetente = inserirDados.nextLine();

                    System.out.println("\nValor a ser transferido: ");
                    valorTransferido = inserirDados.nextDouble();

                    if (valorTransferido > saldo){
                        System.out.println("\nSaldo insuticiente | Saldo atual: R$ " + saldo);
                        break;
                    }

                    saldo -= valorTransferido;


                    System.out.printf("\nTransferência realizada para %s | Saldo atual R$ %f", remetente, saldo);
                }

                case 4 -> {
                    System.out.println("\nOPERAÇÃO ENCERRADA.");

                    System.out.println("\nXXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");
                }
            }
        }
    }
}
