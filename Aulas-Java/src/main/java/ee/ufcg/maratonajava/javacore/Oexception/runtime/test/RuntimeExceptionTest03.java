package ee.ufcg.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {

    public static void main(String[] args) {

        abreConexao();


    }

    public static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
            throw new NullPointerException();
            //return "Conexao aberta";
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recursos do SO");
        }

        return null;
    }

}
