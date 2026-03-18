package academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.test;

import academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
//        Carro carro1 = new Carro("BMW",280);
//        Carro carro2 = new Carro("Fusca", 300);
//        Carro carro3 = new Carro("chevette",255);

        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(150);
        System.out.println(Carro.getVelocidadeLimite());

//        carro1.imprime();
//        carro2.imprime();
//        carro3.imprime();

    }
}
