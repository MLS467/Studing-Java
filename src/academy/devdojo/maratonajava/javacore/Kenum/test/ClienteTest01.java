package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TiposPessoa;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Tibasa", TiposPessoa.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Akira", TiposPessoa.PESSOA_FISICA);

        System.out.println(cliente01);
        System.out.println(cliente02);
    }

}
