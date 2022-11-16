 package ee.ufcg.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class PatternMatcherTest05 {
     public static void main(String[] args) {

         /*
         * \d -> retorna todos os digitos
         * \D -> Tudo o que não for digito
         * \s -> Todos os espaços em branco
         * \S -> Todos os caracteres excluindo os brancos
         * \w -> a-z, A-Z, digitos, _
         * \W -> oposto de \w
         * [] -> procura por determinadas coisas
         * ? -> zero ou uma ocorrencia
         * * -> zero ou mais
         * + -> uma ou mais ocorrencias
         * {n, m} -> de n ate m
         * () -> agrupamento
         * | -> OU
         * $ -> fim da linha
         * . -> 1.3 = 123, 133...
         * */


         String texto = "bruno.almeida@gmail.com, asde@gmail, #$$napoleao@gmail.com, 1545";
         String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z]])+\\.([a-zA-Z]])+";

         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(texto);

         System.out.println("Texto: "+texto);

         System.out.println("regex: "+regex);
         System.out.println("Posicoes encontradas: ");

         while(matcher.find()){
             System.out.print(matcher.start()+" "+matcher.group()+"\n");
         }




     }
 }
