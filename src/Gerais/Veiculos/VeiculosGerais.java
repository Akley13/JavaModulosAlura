package Gerais.Veiculos;

public class VeiculosGerais {
    private String nome;
    private String marca;
    private int AnoDeCriacao;
    private String categoria;
    private String velocidadeMaxima;
    private String combustivel;
    private int quantidadePassageiros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getAnoDeCriacao() {
        return AnoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        AnoDeCriacao = anoDeCriacao;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public void exibeFichaVeiculosGerais(){
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Ano de criação: " + getAnoDeCriacao());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima());
        System.out.println("Combustível: " + getCombustivel());
        System.out.println("Quantidade máxima de passageiros: " + getQuantidadePassageiros());

    }
}
