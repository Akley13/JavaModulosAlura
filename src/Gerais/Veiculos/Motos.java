package Gerais.Veiculos;

public class Motos extends VeiculosGerais {
    private int quantidadeDeRodas;
    private int cilindradas;

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void exibeDadosMotos(){
        System.out.println("\n------ INFORMAÇÕES ADICIONAIS DA MOTO ------");
        System.out.println("\nQuantidade de rodas: " + getQuantidadeDeRodas());
        System.out.println("Cilindradas(cc): " + getCilindradas());
    }
}