package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransfererObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("787-800");
        Pessoa pessoa = Pessoa.PessoaBuilder
                .builder()
                .firstName("Bruno")
                .lastName("Almeida")
                .nickname("brunopbb")
                .email("almeidabruno99@gmail.com")
                .build();

        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);


        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .builder()
                .aircraftName(aircraft.getName())
                .personName(pessoa.getFirstName())
                .country(Country.BRAZIL)
                .currency(currency)
                .build();

        System.out.println(reportDto);

    }
}
