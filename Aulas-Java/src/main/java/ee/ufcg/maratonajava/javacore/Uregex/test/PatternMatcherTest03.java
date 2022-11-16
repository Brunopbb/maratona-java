 package ee.ufcg.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        /*
        * \d -> retorna todos os digitos
        * \D -> Tudo o que não for digito
        * \s -> Todos os espaços em branco
        * \S -> Todos os caracteres excluindo os brancos
        * \w -> a-z, A-Z, digitos, _
        * \W -> oposto de \w
        * [] -> procura por determinadas coisas
        * */

        String regex = "[a-zA-C]";
        String texto = "cafeBABE";
        String texto2 = "abaaba454875aa   aas25441czxajsjsjab";
        String texto3 = "12 123 0x12AF 0x 0X789G 0x124FF";

        String regex2 = "0[xX][0-9a-fA-F]";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto3);

        System.out.println("Texto: "+texto3);
        //System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex2);
        System.out.println("Posicoes encontradas: ");

        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }




    }
}
