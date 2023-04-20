public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento!!!");
        } else {
            System.out.println("Retro, mas é bom!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Filme Negado!");
        }

    }
}
