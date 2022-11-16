package ee.ufcg.maratonajava.javacore.Oexception.exception.test;

import ee.ufcg.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try{
            login();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

        System.out.println("Continuando o programa");

    }

    private static void login() throws LoginInvalidoException{
        String username = "admin";
        String password = "admin";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Usuario: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("senha: ");
        String passwordDigitada = teclado.nextLine();

        if (!usernameDigitado.equals(username) || !password.equals(passwordDigitada)) {
            throw new LoginInvalidoException("Login falhou!");
        }

        System.out.println("Usuario Logado com sucesso");


    }
}
