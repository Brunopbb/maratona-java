package ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public double multiplicaDoisNumeros(double num1, double num2){
        return num1 * num2;
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 10;
        num2 = 50;
        System.out.println("Dentro do metodo alteraDoisNumeros");
        System.out.println("num 1 "+num1);
        System.out.println("num 2 "+num2);
    }


    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println("Soma: "+soma);
    }

    public void somaVarArgs(int...numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println("Soma: "+soma);
    }

}
