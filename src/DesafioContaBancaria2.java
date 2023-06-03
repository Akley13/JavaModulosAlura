import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DesafioContaBancaria2 {
    public static void main(String[] args) {
        Scanner inserirDados = new Scanner(System.in);

        // Váriaveis utilizadas
        int operacao = 0;
        double deposito = 0;
        double valorTransferido = 0;

        System.out.println();
        System.out.println("XXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");
        System.out.println();

        System.out.println("-------------- CADASTRO DE CLIENTE ----------------");
        System.out.println();

        System.out.println("Nome Completo: ");
        String nome = inserirDados.nextLine();

        System.out.println("CPF: ");
        String cpf = inserirDados.nextLine();

        System.out.println("Saldo inicial: ");
        double saldo = inserirDados.nextInt();

        System.out.println();

        System.out.println("-------------- CLIENTE CADASTRADO -----------------");
        System.out.println();

        System.out.println("Nome completo: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo inicial R$ " + saldo);

        System.out.println();
        System.out.println("XXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");
        System.out.println();

        System.out.println("------------------- OPERAÇÕES ---------------------");
        System.out.println();

        System.out.println("SELECIONE A OPÇÃO DESEJADA:");
        System.out.println();

        while (operacao != 4) {

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber depósito");
            System.out.println("3- Transferir valor");
            System.out.println("4- Encerrar operação");
            System.out.println();

            operacao = inserirDados.nextInt();
            System.out.println();
            System.out.println("OPÇÃO: " + operacao);

            if (operacao > 4){
                System.out.println("Opção Inválida!");
                System.out.println();
            }

            switch (operacao){
                case 1:
                    System.out.println("Saldo atual R$ " + saldo);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Valor do depósito: ");
                    deposito = inserirDados.nextDouble();

                    saldo += deposito;

                    System.out.println("Depósito realizado | Saldo atualizado R$ " + saldo);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Valor a ser transferido: ");
                    valorTransferido = inserirDados.nextDouble();
                    System.out.println();

                    if (valorTransferido > saldo){
                        System.out.println("Saldo insuticiente | Saldo atual: R$ " + saldo);
                        System.out.println();
                        break;
                    }

                    saldo -= valorTransferido;

                    System.out.println("Valor da transferência | R$ " + valorTransferido);
                    System.out.println("Saldo Atualizado | R$ " + saldo);

                    System.out.println();
                    break;

                case 4:
                    System.out.println("OPERAÇÃO ENCERRADA.");
                    System.out.println();
                    System.out.println("XXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");

                    break;
            }
        }


    }
}
