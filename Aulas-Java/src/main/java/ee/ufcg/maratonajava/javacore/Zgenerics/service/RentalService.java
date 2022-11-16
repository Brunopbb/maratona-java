package ee.ufcg.maratonajava.javacore.Zgenerics.service;

import ee.ufcg.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService<T>{

    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarDisponivel(){
        System.out.println("Buscando disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando: "+t);
        System.out.println("disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarAlugado(T t){
        System.out.println("Devolvendo: "+t);
        objetosDisponiveis.add(t);
        System.out.println("Disponiveis: ");
        System.out.println(objetosDisponiveis);
    }

}
