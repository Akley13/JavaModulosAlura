import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        double saldo = 70560;
        int opcao = 1;
        int valorRecebimento = 0;
        int valorTransferencia = 0;
        int contador = 0;

        System.out.println("**********************************************");
        System.out.println("-------------- DADOS DO CLIENTE --------------");

        System.out.println();

        System.out.println("Nome Completo: Akley Alves de Araujo Silva");
        System.out.println("Tipo de Conta: Corrente");
        System.out.println("Saldo: R$ 70.560,00");

        System.out.println();

        System.out.println("----------------- PimpoBank ------------------");
        System.out.println("**********************************************");

        System.out.println();

        System.out.println("            ----- OPERAÇÕES -----             ");

        System.out.println();

        while (contador != 4) {

            System.out.println("1- Consultar saldo");
            System.out.println("2- Recebimentos");
            System.out.println("3- Transferências");
            System.out.println("4- Sair");

            System.out.println();

            System.out.println("Opção desejada: ");
            opcao = inputData.nextInt();

            if (opcao == 1) {

                System.out.println("Saldo: " + saldo);
                System.out.println();

                contador++;

            } else if (opcao == 2) {

                System.out.println("Valor a receber: ");
                valorRecebimento = inputData.nextInt();

                saldo += valorRecebimento;

                System.out.println("Salto atualizado: R$ " + saldo);
                System.out.println();

                contador++;

            } else if (opcao == 3) {

                System.out.println("Valor da transferência: ");
                valorTransferencia = inputData.nextInt();

                saldo -= valorTransferencia;

                System.out.println("Salto atualizado: R$ " + saldo);

                contador++;

            } else {
                break;
            }
        }
    }
}
