package br.com.movie.netflixBay.calculos;

public class FiltroDeRecomendacao {
    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos!");
        }else if(classificacao.getClassificacao() >= 2){
            System.out.println("Esta na media!");
        }else {
            System.out.println("Filme pouco interessante!");
        }
    }
}
