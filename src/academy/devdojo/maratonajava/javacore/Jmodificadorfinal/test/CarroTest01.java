package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01  {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

//        carro.COMPRADOR = comprador;
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");

        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari("Vermelho sangue");
        ferrari.setNome("JOJO");

        System.out.println(ferrari.getNome());

    }
}
