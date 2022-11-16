package ee.ufcg.maratonajava.javacore.Hheranca.test;

import ee.ufcg.maratonajava.javacore.Hheranca.dominio.Funcionario;


//0 - Bloco de inicialização  estatico da superclasse é executado quando a JVM carrega a classe pai
//1 - Bloco de inicialização  estatico da subclasse é executado quando a JVM carrega a classe filha
//2 - É alocado memoria para o objeto da classe pai
//3 - Os atributos de classe são inicializados com os valores default/atribuidos (classe pai)
//4 - O bloco de inicialização da superclasse é executado
//5 - O construtor da superclasse é executado
//6 - É alocado memoria para o objeto da subclasse
//7 - Os atributos de classe são inicializados com os valores default/atribuidos (subclasse)
//8 - O bloco de inicialização da subclasse é executado
//9 - O construtor da subclasse é executado


public class HerancaTest02 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Bruno", 0.0);



    }

}
