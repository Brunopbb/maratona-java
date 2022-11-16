package ee.ufcg.maratonajava.javacore.Kenum.test;

import ee.ufcg.maratonajava.javacore.Kenum.dominio.Cliente;
import ee.ufcg.maratonajava.javacore.Kenum.dominio.TipoCliente;
import ee.ufcg.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Bruno", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(1000));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(1000));


    }


}
