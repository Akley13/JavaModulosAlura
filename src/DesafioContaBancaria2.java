import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DesafioContaBancaria2 {
    public static void main(String[] args) {
        Scanner inserirDados = new Scanner(System.in);

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

        System.out.println("--------------- CLIENTE CADASTRADO -----------------");
        System.out.println();

        System.out.println("Nome completo: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo inicial: R$ " + saldo);

        System.out.println();
        System.out.println("XXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");

        System.out.println("------------------- OPERAÇÕES ---------------------");
        System.out.println();

        System.out.println("SELECIONE A OPÇÃO DESEJADA:");

        int operacao = 0;

        while (operacao != 4) {

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferências");
            System.out.println("4- Encerrar operação");

            operacao = inserirDados.nextInt();

            switch (operacao){
                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("");
            }
        }


    }
}
