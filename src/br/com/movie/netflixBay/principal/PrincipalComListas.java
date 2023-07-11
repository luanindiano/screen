package br.com.movie.netflixBay.principal;

import br.com.movie.netflixBay.modelos.Filme;
import br.com.movie.netflixBay.modelos.Serie;
import br.com.movie.netflixBay.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Django Livre", 2003, "Tarantino");
        filme1.avalia(10);
        Filme filme2 = new Filme("Django Preso", 2004, "Tarantina");
        filme2.avalia(9);
        Filme filme3 = new Filme("Django Solto", 2005, "Tarantine");
        filme3.avalia(7);
        Serie serie1 = new Serie("Breaking Bad", 2013);
        serie1.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for (Titulo item: lista){ //para cada item da variavel lista do tipo Titulo faça:
            System.out.println(item.getNome());
            if (item instanceof Filme filme){ //Se ele é um filme
                /*Filme filme = (Filme) item;*/
                System.out.println("Classificação: " + filme.getClassificacao() + " Stars");
            }


        }

        System.out.println("------Array List Atores (Collections)------");
        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Luan Indiano");
        buscaPorArtista.add("John Travolta");
        buscaPorArtista.add("Leonardo DiCaprio");

        System.out.println("Antes da ordenação: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação: " +buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Minha lista de filme ordenada pelo nome: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Minha lista de filme ordenada por ano: " + lista);
    }
}
