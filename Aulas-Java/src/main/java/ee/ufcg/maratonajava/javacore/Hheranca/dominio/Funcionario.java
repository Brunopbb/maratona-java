package ee.ufcg.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;


    static {
        System.out.println("Dentro do bloco de inicialização estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }


    public Funcionario(String nome, double salario){
        super(nome);
        this.salario = salario;
        System.out.println("Dentro do construtor de Funcionario");
    }

    public Funcionario(String nome, int idade){
        super(nome, idade);
    }


    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
