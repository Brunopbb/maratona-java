package ee.ufcg.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        /*
        * \d -> retorna todos os digitos
        * \D -> Tudo o que não for digito
        * \s -> Todos os espaços em branco
        * \S -> Todos os caracteres excluindo os brancos
        * \w -> a-z, A-Z, digitos, _
        * \W -> oposto de \w
        *
        * */

        String regex = "\\s";
        String texto = "abaaba";
        String texto2 = "abaaba454875aa   aas25441czxajsjsjab";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto: "+texto2);
        //System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posicoes encontradas: ");

        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }


    }
}
