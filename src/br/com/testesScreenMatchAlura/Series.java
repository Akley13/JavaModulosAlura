package br.com.testesScreenMatchAlura;

public class Series extends Titulo {
    private int episodiosPorTemporada;
    private int numTemporadas;
    private int minutosPorEpisodio;

    public void exibeDadosSerie() {
        System.out.println("\nNome da série: " + getNome());
        System.out.println("N° de temporadas: " + getNumTemporadas());
        System.out.println("Episódios por temporada: " + getEpisodiosPorTemporada());
        System.out.println("Minutos por episódio: " + getMinutosPorEpisodio());
        System.out.println("Duração total (minutos): " + getDuracaoEmMinutos());
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // SOBRESCRITA DE MÉTODO - Anotação @Override possibilita a sobrescrita de um método para funcionar de maneira diferente na classe em questão.
    @Override
    public int getDuracaoEmMinutos() {
        return numTemporadas * minutosPorEpisodio * episodiosPorTemporada;
    }
}
