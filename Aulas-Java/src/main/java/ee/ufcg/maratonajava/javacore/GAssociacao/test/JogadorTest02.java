package ee.ufcg.maratonajava.javacore.GAssociacao.test;

import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Jogador;
import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Bruno");
        Time time = new Time("Barcelona");

        jogador.setTime(time);
        jogador.imprime();

    }
}
