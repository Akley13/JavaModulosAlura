import br.com.testes.Filmes;
import br.com.testes.Series;
public class Principal {
    public static void main(String[] args) {

        Series vinlandSaga = new Series();
        vinlandSaga.setNome("Vinland Saga");
        vinlandSaga.setNumTemporadas(3);
        vinlandSaga.setEpsodiosPorTemporada(9);
        vinlandSaga.setMinutosPorEpsodio(23);

        vinlandSaga.exibeDadosSerie();

        System.out.println();

        Filmes avatar = new Filmes();
        avatar.setNome("AVATAR");
        avatar.setDuracaoEmMinutos(180);

        avatar.exibeDadosFilme();
    }
}
