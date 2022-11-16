package ee.ufcg.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, int idade){
        this(nome);
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }


    public void imprime(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Endereco: ");
        System.out.println("Rua: "+endereco.getRua());
        System.out.println("Bairro: "+endereco.getBairro());
        System.out.println("Cep: "+endereco.getCep());
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
