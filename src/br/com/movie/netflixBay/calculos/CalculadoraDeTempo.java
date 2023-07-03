package br.com.movie.netflixBay.calculos;

import br.com.movie.netflixBay.modelos.Filme;
import br.com.movie.netflixBay.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
