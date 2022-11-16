package ee.ufcg.maratonajava.javacore.Tresourcebundle;

import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Local;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {

    public static void main(String[] args) {



        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(bundle.getString("hello"));

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(bundle.getString("hello"));

    }
}
