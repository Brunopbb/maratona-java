package ee.ufcg.maratonajava.javacore.DConstrutores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    private String estudio;


    public Anime(String nome, String tipo, String genero, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, String genero, int episodios, String estudio){
        this(nome, tipo, genero, episodios);
        this.estudio = estudio;
    }


    public Anime(){

    }



    public void imprime(){
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("Episodios: "+episodios);
        System.out.println("Genero: "+genero);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public String getTipo(){
        return tipo;
    }

    public int getEpisodios(){
        return episodios;
    }

}
