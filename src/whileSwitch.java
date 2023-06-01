import java.util.Scanner;
public class whileSwitch {
    public static void main(String[] args) {
        Scanner leituraDeDados = new Scanner(System.in);

        int contador = 0;
        int numeroEscolhido = 1;

        while (numeroEscolhido != 5) {

            System.out.println("==================== ESCOLAS ====================");
            System.out.println();

            System.out.println("Contador: " + contador++);
            System.out.println();

            System.out.println("Digite o número relacionado a escola desejada.");

            System.out.println();

            System.out.println("1- Protágoras");
            System.out.println("2- Colégio JR");
            System.out.println("3- Uno Sales");
            System.out.println("4- Juventus");
            System.out.println("5- Encerrar operação");

            numeroEscolhido = leituraDeDados.nextInt();

            System.out.println();
            System.out.println("=================================================");

            switch (numeroEscolhido) {

                case 1:
                    System.out.println("Protágoras");
                    break;
                case 2:
                    System.out.println("Colégio JR");
                    break;
                case 3:
                    System.out.println("Uno Sales");
                    break;
                case 4:
                    System.out.println("Juventus");
                    break;
                case 5:
                    System.out.println("Operação encerrada!");
                    break;
            }
        }
    }

}