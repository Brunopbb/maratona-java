package ee.ufcg.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = -124860441262420244L;
    private long id;
    private String nome;
    private transient String password;

    private static final String NOME_ESCOLA = "Devdojo";

    private transient Turma turma;


    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream){
        try{
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeUTF(turma.getNome());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream objectInputStream){
        try{

            objectInputStream.defaultReadObject();
            String nomeTurma = objectInputStream.readUTF();
            turma = new Turma(nomeTurma);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma ='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public long getId() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
