package ee.ufcg.maratonajava.javacore.Eblocodeinicializacao.dominio;


//1 - É alocado memoria para o objeto
//2 - Os atributos de classe são inicializados com os valores default/atribuido
//3 - O bloco de inicialização é executado
//4 - O construtor é executado

public class Anime {

    private String nome;
    private int[] episodios;



    {
        //Bloco de inicializacao
        //Executado toda vez que um objeto é criado
        //executado antes do construtor

        System.out.println("Dentro do bloco de inicializazao");

        episodios = new int[100];

        for(int i = 0; i < 100; i++){
            episodios[i] = i + 1;
        }


    }



    public Anime() {

        System.out.println("Dentro do construtor");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
