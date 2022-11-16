package ee.ufcg.maratonajava.javacore.Jmodificadorfinal.dominio;

//Quando uma classe é declarada como final, ela não pode ser extendida.
//Quando um metodo é declarado como final, ele não pode ser sobrescrito.

public class Carro {

    private String nome;
    private final Comprador COMPRADOR = new Comprador();
    private static final double VELOCIDADE_LIMITE = 250; //precisa de uma valor inicial


    public Carro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
