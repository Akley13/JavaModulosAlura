public class FormatacaoTexto {
    public static void main(String[] args) {
        String nome = "Akley"; // %s indica String
        int idade = 22;       // %d indica valor inteiro
        double valor = 10.567676;  // %f indica valor decimal
        System.out.println(String.format("Meu nome é %s, idade %d anos e hoje gastei R$ %.2f.", nome, idade, valor));

    }
}
