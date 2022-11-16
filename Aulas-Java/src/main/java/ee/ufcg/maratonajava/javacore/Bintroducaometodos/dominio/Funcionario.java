package ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salarios: ");
        if(salarios != null && salarios.length > 0){
            for (double salario : salarios) {
                System.out.println(salario);
            }
            mediaSalarios();
        }else {
            System.out.println("Não há salarios");
        }
    }

    private void mediaSalarios(){

        if(salarios != null && salarios.length > 0) {

            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


}
