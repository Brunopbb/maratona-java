package ee.ufcg.maratonajava.javacore.YColecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome);
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && nome.equals(manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Manga o) {
        //retorna negativo se this < o
        //retorna zero se this for igual a o
        //retorna positivo se this > o

//        if(this.id < o.id){
//            return -1;
//        }else if(this.id == o.getId()){
//            return 0;
//        }else{
//            return 1;
//        }

        return this.nome.compareTo(o.getNome());


    }
}
