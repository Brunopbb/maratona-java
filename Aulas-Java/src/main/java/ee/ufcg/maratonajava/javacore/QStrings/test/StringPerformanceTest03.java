package ee.ufcg.maratonajava.javacore.QStrings.test;

public class StringPerformanceTest03 {
    public static void main(String[] args) {

        long inicio1= System.currentTimeMillis();
        concatena(100000);
        long fim1= System.currentTimeMillis();

        double variacao1 = (fim1 - inicio1);


        System.out.println(variacao1 + " ms");

        long inicio2= System.currentTimeMillis();
        concatena2(100000);
        long fim2= System.currentTimeMillis();

        double variacao2 = (fim2 - inicio2);


        System.out.println(variacao2 + " ms");





    }

    public static void concatena(int tamanho){
        String texto = "";

        for(int i = 0; i < tamanho; i++){
            texto += i;
        }
    }

    public static void concatena2(int tamanho){
        StringBuilder texto = new StringBuilder(tamanho);

        for(int i = 0; i < tamanho; i++){
            texto.append(i);
        }



    }

}
