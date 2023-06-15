package Gerais.Veiculos;

public class Carros extends  VeiculosGerais {
    private int cavalos;

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public void exibeDadosCarros(){
        System.out.println("\n------ INFORMAÇÕES ADICIONAIS DO CARRO ------");
        System.out.println("\nCavalos(cv): " + getCavalos());
    }
}
