package ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
    }




}
