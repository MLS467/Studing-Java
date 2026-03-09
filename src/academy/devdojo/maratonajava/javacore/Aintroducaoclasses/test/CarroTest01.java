package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Fusca";
        carro.modelo = "Volkswagen";
        carro.ano = 1950;

        carro2.nome = "Monza";
        carro2.modelo = "Chevrollet";
        carro2.ano = 1995;

        System.out.println(
                "nome " + carro.nome +"\n"+
                "modelo " + carro.modelo +"\n"+
                "ano " + carro.ano +"\n"
        );

        System.out.println(
                "nome " + carro2.nome +"\n"+
                "modelo " + carro2.modelo +"\n"+
                "ano " + carro2.ano +"\n"
        );
    }

}
