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

        System.out.println("-------------- CLIENTE CADASTRADO ----------------");
        System.out.println();

        System.out.println("Nome completo: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo inicial: R$ " + saldo);

        System.out.println();
        System.out.println("XXXXXXXXXXXXXXXXXXXX KESS BANK XXXXXXXXXXXXXXXXXXXX");

        

    }
}
