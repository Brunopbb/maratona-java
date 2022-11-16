package ee.ufcg.maratonajava.javacore.Csobrecargademetodos.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;


    public void init(String nome, String tipo, int episodios){

        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }


    public void init(String nome, String tipo, int episodios, String genero){

        init(nome, tipo, episodios);
        this.genero = genero;

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
