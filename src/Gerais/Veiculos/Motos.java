package Gerais.Veiculos;

public class Motos extends VeiculosGerais {
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void exibeDadosMotos(){
        System.out.println("\n------ INFORMAÇÕES ADICIONAIS DA MOTO ------");
        System.out.println("\nCilindradas(cc): " + getCilindradas());
    }
}
