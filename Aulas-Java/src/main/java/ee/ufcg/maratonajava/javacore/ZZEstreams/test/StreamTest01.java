package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 titles light novels with price less than 4

import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class StreamTest01 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("overlod", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game No life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.99)
    ));

    public static void main(String[] args) {


        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));

        int control = 0;
        for(LightNovel lt : lightNovelList){
            if(lt.getPrice() <= 4 && control < 3){
                System.out.println(lt.getTitle());
                control+=1;
            }
        }





    }
}
