package ee.ufcg.maratonajava.javacore.QStrings.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {

        String name = "      Bruno        ";

        System.out.println(name.charAt(4));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0));
        System.out.println(name.replace('r', 'V'));
        System.out.println(name.trim());

        System.out.println(name);

    }
}
