package br.com.testes;

public class Series extends Titulo {
    private int epsodiosPorTemporada;
    private int numTemporadas;
    private int minutosPorEpsodio;

    public void exibeDadosSerie() {
        System.out.println("\nNome da série: " + getNome());
        System.out.println("N° de temporadas: " + getNumTemporadas());
        System.out.println("Episódios por temporada: " + getEpsodiosPorTemporada());
        System.out.println("Minutos por episódio: " + getMinutosPorEpsodio());
        System.out.println("Duração total (minutos): " + getDuracaoEmMinutos());
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }


    @Override
    public int getDuracaoEmMinutos() {
        return numTemporadas * minutosPorEpsodio * epsodiosPorTemporada;
    }
}
