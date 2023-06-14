package br.com.testesScreenMatchAlura;

public class Filmes extends Titulo {
    private String diretor;

    public void exibeDadosFilme() {
        System.out.println("Filme: " + getNome());
        System.out.println("Duração minutos: " + getDuracaoEmMinutos());
        System.out.println("Diretor: ");
    }

    
}

