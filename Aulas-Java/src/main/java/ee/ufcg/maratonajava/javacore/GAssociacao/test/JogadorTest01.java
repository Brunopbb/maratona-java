package ee.ufcg.maratonajava.javacore.GAssociacao.test;

import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Fred");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Zezao");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }

    }
}
