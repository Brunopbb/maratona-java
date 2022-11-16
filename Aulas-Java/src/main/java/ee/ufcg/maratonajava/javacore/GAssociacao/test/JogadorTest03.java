package ee.ufcg.maratonajava.javacore.GAssociacao.test;

import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Jogador;
import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Pele");


        Time brasil = new Time("Brasil", new Jogador[]{jogador1, jogador3});
        Time argentina = new Time("Argentina", new Jogador[]{jogador2});

        jogador1.setTime(brasil);
        jogador2.setTime(argentina);
        jogador3.setTime(brasil);


        System.out.println("--------Time do Brasil--------");
        brasil.imprime();
        System.out.println("--------Time da Argentina--------");
        argentina.imprime();

        System.out.println("-------- Jogadores--------");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();




    }
}
