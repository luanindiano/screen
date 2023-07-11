package br.com.movie.netflixBay.modelos;

import br.com.movie.netflixBay.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {

    //Construtor
    public Filme(String nome, int anoDeLancamento, String diretor) {
        super(nome, anoDeLancamento);
        this.setDiretor(diretor);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2; //fazendo casting (int)
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
