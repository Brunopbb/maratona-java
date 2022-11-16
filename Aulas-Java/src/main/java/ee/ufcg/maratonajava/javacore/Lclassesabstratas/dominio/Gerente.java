package ee.ufcg.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome, salario);
        calculaBonus();
    }

    public void calculaBonus(){
        this.salario = this.salario + this.salario * 0.1;
    }



}
