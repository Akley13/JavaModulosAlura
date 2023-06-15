package Gerais.Veiculos;

public class Principal {
    public static void main(String[] args) {

        VeiculosGerais bmwI4 = new VeiculosGerais();
        bmwI4.setNome("BMW i4");
        bmwI4.setMarca("BMW");
        bmwI4.setCategoria("Esportiva");
        bmwI4.setAnoDeCriacao(2022);
        bmwI4.setVelocidadeMaxima("225 Km/h");
        bmwI4.setCombustivel("Elétrico");
        bmwI4.setQuantidadePassageiros(5);

        bmwI4.exibeFichaVeiculosGerais();
    }
}
