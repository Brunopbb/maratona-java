package ee.ufcg.maratonajava.javacore.Eblocodeinicializacao.test;

import ee.ufcg.maratonajava.javacore.Eblocodeinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime();

        for(int episodios : anime.getEpisodios()){
            System.out.print(episodios+" ");
        }

    }


}
