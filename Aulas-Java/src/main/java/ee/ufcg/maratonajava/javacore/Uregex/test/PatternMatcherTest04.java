 package ee.ufcg.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class PatternMatcherTest04 {
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


         String texto = "12 123 0x12AF 0x 0X789G 0x124FF 0x10G";
         String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

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
