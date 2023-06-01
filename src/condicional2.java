public class condicional2 {
    public static void main(String[] args) {
        int anoDeLancamento = 2002;
        boolean incluidoNoPlano = false;
        double nota = 9.5;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2000 & anoDeLancamento <= 2010) {
            System.out.println("Filme não muito recente!");
        } else if (anoDeLancamento > 2010) {
            System.out.println("Filme recente!");
        } else {
            System.out.println("Filme antigo!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("Plus")){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
