public class condicional2 {
    public static void main(String[] args) {
        int anoDeLancamento = 2002;
        boolean incluidoNoPlano = true;
        double nota = 9.5;

        if (anoDeLancamento > 2000 & anoDeLancamento < 2010) {
            System.out.println("Filme não muito recente!");
        } else if (anoDeLancamento > 2010) {
            System.out.println("Filme recente!");
        } else {
            System.out.println("Filme antigo!");
        }
    }
}
