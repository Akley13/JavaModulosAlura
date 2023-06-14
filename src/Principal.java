import br.com.testesScreenMatchAlura.Filmes;
import br.com.testesScreenMatchAlura.Series;
public class Principal {
    public static void main(String[] args) {

        Series vinlandSaga = new Series();
        vinlandSaga.setNome("Vinland Saga");
        vinlandSaga.setNumTemporadas(3);
        vinlandSaga.setEpisodiosPorTemporada(9);
        vinlandSaga.setMinutosPorEpisodio(23);

        vinlandSaga.exibeDadosSerie();

        System.out.println();

        Filmes avatar = new Filmes();
        avatar.setNome("AVATAR");
        avatar.setDiretor("James Cameron");
        avatar.setDuracaoEmMinutos(180);

        avatar.exibeDadosFilme();
    }
}
