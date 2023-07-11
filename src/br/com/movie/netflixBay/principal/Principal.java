package br.com.movie.netflixBay.principal;

import br.com.movie.netflixBay.calculos.CalculadoraDeTempo;
import br.com.movie.netflixBay.calculos.FiltroDeRecomendacao;
import br.com.movie.netflixBay.modelos.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Pulp Fiction", 1990, "Tarantino");
        meuFilme.setAnoDeLancamento(1987);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        System.out.println(listaDeFilmes.get(0).toString());
    }
}