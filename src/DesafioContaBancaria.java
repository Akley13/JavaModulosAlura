import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        String nome = "João das Neves";
        String tipoConta = "Corrente";
        double saldo = 1000.00;
        int opcao = 1;
        int valorRecebimento = 0;
        int valorTransferencia = 0;
        int contador = 0;

        System.out.println("**********************************************");
        System.out.println("-------------- DADOS DO CLIENTE --------------");

        System.out.println("\nNome Completo: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: R$ " + saldo);

        System.out.println("\n----------------- PimpoBank ------------------");
        System.out.println("**********************************************");

        System.out.println("\n            ----- OPERAÇÕES -----             ");

        System.out.println();

        while (contador != 4) {

            System.out.println("1- Consultar saldo");
            System.out.println("2- Recebimentos");
            System.out.println("3- Transferências");
            System.out.println("4- Sair");

            System.out.println();

            System.out.println("Opção desejada: ");
            opcao = inputData.nextInt();

            System.out.println();

            if (opcao == 1) {

                System.out.println("Saldo: R$ " + saldo);
                System.out.println();

            } else if (opcao == 2) {

                System.out.println("Valor a receber: ");
                valorRecebimento = inputData.nextInt();

                saldo += valorRecebimento;

                System.out.println();

                System.out.println("Salto atualizado: R$ " + saldo);
                System.out.println();

            } else if (opcao == 3) {

                System.out.println("Valor da transferência: ");
                valorTransferencia = inputData.nextInt();

                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente | Saldo atual: R$ " + saldo);
                    break;
                }

                System.out.println();

                saldo -= valorTransferencia;

                System.out.println("Salto atualizado: R$ " + saldo);

                System.out.println();

            } else if (opcao != 4){
                System.out.println("Opção inválida!");
                System.out.println();

            } else {
                break;
            }
        }
    }
}
