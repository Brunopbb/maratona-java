package ee.ufcg.maratonajava.javacore.Fmodificadorestatico.dominio;

//0 - Bloco de inicialização estatico é executado quando a JVM carrega a classe
//1 - É alocado memoria para o objeto
//2 - Os atributos de classe são inicializados com os valores default/atribuidos
//3 - O bloco de inicialização é executado
//4 - O construtor é executado

public class Anime {

    private String nome;
    private static int[] episodios;



    static{
        //Bloco de inicializacao
        //Executado toda vez que um objeto é criado
        //executado antes do construtor

        System.out.println("Dentro do bloco de inicializazao 1");

        episodios = new int[100];

        for(int i = 0; i < 100; i++){
            episodios[i] = i + 1;
        }


    }

    static {
        System.out.println("Dentro do bloco de inicializazao 2");
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

//    public void setEpisodios(int[] episodios) {
//        Anime.episodios = episodios;
//    }
}
