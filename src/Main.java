public class Main {
    public static void main(String[] args) {
        System.out.println("SCREEN MATCH");
        System.out.println("Filme: Top Gun - Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento); // concatenação

        double notaDoFilme = 8.1;
        System.out.println("Nota do filme: " + notaDoFilme);

        boolean incluidoNoPlano = true;
        System.out.println("Plano (True/False): " + incluidoNoPlano);

        double mediaFilme = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(mediaFilme);

        // 1° método
        String sinopse;
        sinopse = "Filme de aventura SENSACIONAL!";
        System.out.println(sinopse);

        //2° método
        //JAVA15
        /*String sinopse = """
                            Texto formatado
                            Quebrando linha
                           """ + anoLancamento;*/



    }
}