package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.CalculadoraImposto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {


    public static void main(String[] args) {
        Produto produto = new Computador("HWCU", 3000);

        Tomate tomate = new Tomate("Boladao", 20);

        tomate.setDataDeValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(produto);
        CalculadoraImposto.calcularImposto(tomate);
    }


}
