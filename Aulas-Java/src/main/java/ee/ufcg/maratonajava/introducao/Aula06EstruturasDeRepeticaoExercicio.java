package ee.ufcg.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {
        for(int i = 0; i <= 1000000; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
