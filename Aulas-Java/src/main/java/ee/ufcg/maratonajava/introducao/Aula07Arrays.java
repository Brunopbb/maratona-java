package ee.ufcg.maratonajava.introducao;

public class Aula07Arrays {

    public static void main(String[] args) {
        int[][] idades = new int[3][];

        idades[0][0] = 1;
        idades[0][1] = 1;
        idades[0][2] = 1;
        idades[1][0] = 1;
        idades[1][1] = 1;
        idades[1][2] = 1;


        for(int[] arrayBase: idades){
            for (int num: arrayBase){
                System.out.println(num);
            }
        }

    }
}
