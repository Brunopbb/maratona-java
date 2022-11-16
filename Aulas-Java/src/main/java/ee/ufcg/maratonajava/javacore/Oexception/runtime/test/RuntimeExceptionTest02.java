package ee.ufcg.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {

        System.out.println(divide2(1, 0));

        System.out.println("Continuando codigo");

    }

    public static int divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, b não pode ser zero");
        }
        return a/b;
    }

    public static int divide2(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }

        return 0;
    }

}
