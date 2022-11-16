package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class CurrencyFactory {

    public static Currency newCurrency(Country country){
        switch (country){
            case USA -> {
                return new Dolar();
            }
            case BRAZIL -> {
                return new Real();
            }
            default -> throw new IllegalArgumentException("Nenhuma moeda foi encontrada para esse pais");
        }
    }

}
