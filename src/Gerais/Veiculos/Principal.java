package Gerais.Veiculos;

public class Principal {
    public static void main(String[] args) {

        // CARROS
        VeiculosGerais bmwI4 = new VeiculosGerais();
        bmwI4.setNome("BMW i4");
        bmwI4.setMarca("BMW");
        bmwI4.setCategoria("Esportiva");
        bmwI4.setAnoDeCriacao(2022);
        bmwI4.setVelocidadeMaxima("225 Km/h");
        bmwI4.setCombustivel("Elétrico");
        bmwI4.setQuantidadePassageiros(5);

        bmwI4.exibeFichaVeiculosGerais();


        // MOTOS
        Motos breakout117 = new Motos();
        breakout117.setNome("Breakout 117");
        breakout117.setMarca("Harley Davidson");
        breakout117.setCategoria("Cruiser");
        breakout117.setAnoDeCriacao(2023);
        breakout117.setVelocidadeMaxima("150 Km/h");
        breakout117.setCombustivel("Gasolina");
        breakout117.setQuantidadePassageiros(2);
        breakout117.setCilindradas(1968);
        breakout117.setQuantidadeDeRodas(2);

        breakout117.exibeFichaVeiculosGerais();
        breakout117.exibeDadosMotos();

    }
}
