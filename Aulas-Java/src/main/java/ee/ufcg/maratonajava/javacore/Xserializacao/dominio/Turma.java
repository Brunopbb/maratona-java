package ee.ufcg.maratonajava.javacore.Xserializacao.dominio;

import java.io.Serial;
import java.io.Serializable;

public class Turma{

    @Serial
    private static final long serialVersionUID = -2856396701509606289L;
    private String nome;


    public Turma(String nome) {
        this.nome = nome;
    }



    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
