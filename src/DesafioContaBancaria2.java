import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DesafioContaBancaria2 {
    public static void main(String[] args) {
        Scanner inserirDados = new Scanner(System.in);

        // Váriaveis utilizadas
        int operacao = 0;
        double deposito = 0;
        double valorTransferido = 0;

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

        System.out.println("\nXXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");

        System.out.println("\n------------------- OPERAÇÕES ---------------------");

        System.out.println("\nSELECIONE A OPÇÃO DESEJADA:");

        // laço de repetição
        while (operacao != 4) {

            String menu = """
                    \n1- Consultar saldo
                    2- Receber depósito
                    3- Transferir valor
                    4- Encerrar operação
                          """;

            System.out.println(menu);

            operacao = inserirDados.nextInt();
            System.out.println("\nOPÇÃO: " + operacao);

            if (operacao > 4){
                System.out.println("\nOpção Inválida!");
            }

            // Condicional
            switch (operacao){
                case 1:
                    System.out.println("\nSaldo atual R$ " + saldo);
                    break;

                case 2:
                    System.out.println("\nValor do depósito: ");
                    deposito = inserirDados.nextDouble();

                    saldo += deposito;

                    System.out.println("\nDepósito realizado | Saldo atual R$ " + saldo);
                    break;

                case 3:
                    System.out.println("\nValor a ser transferido: ");
                    valorTransferido = inserirDados.nextDouble();

                    if (valorTransferido > saldo){
                        System.out.println("\nSaldo insuticiente | Saldo atual: R$ " + saldo);
                        break;
                    }

                    saldo -= valorTransferido;

                    System.out.println("\nValor da transferência | R$ " + valorTransferido);
                    System.out.println("Saldo Atualizado | R$ " + saldo);
                    break;

                case 4:
                    System.out.println("\nOPERAÇÃO ENCERRADA.");

                    System.out.println("\nXXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");
                    break;
            }
        }


    }
}
