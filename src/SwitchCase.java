public class SwitchCase {
    public static void main(String[] args) {
        int sorvete = 4;
        String saborSorvete;

        switch (sorvete) {
            case 1:
                saborSorvete = "Morango";
                break;

            case 2:
                saborSorvete = "Maracujá";
                break;

            case 3:
                saborSorvete = "Limão";
                break;

            case 4:
                saborSorvete = "Chocolate";
                break;

            default:
                saborSorvete = "Infelizmente não temos esse sabor.";
                break;
        }

        System.out.println("O código" + sorvete + ", é referente ao sabor " + saborSorvete);
    }

}

