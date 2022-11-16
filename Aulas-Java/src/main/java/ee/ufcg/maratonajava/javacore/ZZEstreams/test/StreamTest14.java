package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.Category;
import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest14 {

    /**
     * - benchmark
     * - unboxing | boxing
     * - (limit, findFirst) -> ruim
     * - Custo total da computação (muito processamento)
     * - Quantidade de dados
     * - Tipos de coleções
     * - Tamanho do stream (tamanho definido é melhor)
     * - Processamento do merge
     * if(tarefa for pequena e não pode ser dividida){
     *     faz sequencialmente
     * }else{
     *     divide em duas tarefas
     *     chama o metodo recursivamente
     *     espera todas as terefas serem completadas
     *     combina o resultado
     * }
     *
     */


    public static void main(String[] args) {

        //System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);


    }
    private static void sumFor(long num){

        long result = 0;
        long time = 0;
        long init = System.currentTimeMillis();
        for(int i = 0; i < num; i++){
            result+=i;
        }
        long end = System.currentTimeMillis();
        time = end-init;
        System.out.println(result+" "+time+" ms");

    }

    private static void sumStreamIterate(long num){

        long result = 0;
        long time = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        time = end-init;
        System.out.println(result+" "+time+" ms");

    }

    private static void sumParallelStreamIterate(long num){

        long result = 0;
        long time = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        time = end-init;
        System.out.println(result+" "+time+" ms");

    }

}
