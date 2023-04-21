public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento!!!");
        } else {
            System.out.println("Retro, mas é bom!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) { // E
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Filme Negado!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) { // OU
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Filme Negado!");
        }
    }
}
