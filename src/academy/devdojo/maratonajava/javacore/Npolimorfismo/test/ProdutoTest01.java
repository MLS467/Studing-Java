package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.CalculadoraImposto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC1017", 11000);
        Tomate tomate = new Tomate("Tomate bolado", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(televisao);


    }
}
