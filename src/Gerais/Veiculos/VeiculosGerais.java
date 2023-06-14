package Gerais.Veiculos;

public class VeiculosGerais {
    private String nome;
    private String marca;
    private String velocidade;
    private String combustivel;
    private int AnoDeCriacao;
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

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
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
}
