package ee.ufcg.maratonajava.javacore.Xserializacao.test;

import ee.ufcg.maratonajava.javacore.Xserializacao.dominio.Aluno;
import ee.ufcg.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerializacaoTest01 {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        Aluno aluno1 = new Aluno(12345678L, "bruno", "12346sds354");
        Aluno aluno2 = new Aluno(12345678L, "Maria", "45s4ds");
        Aluno aluno3 = new Aluno(12345678L, "Thiago", "12s87d8s34654");
        Turma turma = new Turma("Maratona java virado no jiraya");
        aluno1.setTurma(turma);
        aluno2.setTurma(turma);
        aluno3.setTurma(turma);

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);


        serializar(alunos);
        deserializar();

    }

    public static void serializar(List<Aluno> alunos){
        Path path = Paths.get("aluno.ser");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            for(Aluno a : alunos) {
                objectOutputStream.writeObject(a);
            }

        }catch (IOException e){

            e.printStackTrace();

        }

    }

    public static void deserializar(){
        Path path = Paths.get("aluno.ser");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){


            Aluno aluno = (Aluno) (objectInputStream.readObject());
            System.out.println(aluno);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
