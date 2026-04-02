package academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do " + produto.getNome());
        double valor = produto.calculaImposto();
        System.out.println(produto.getNome() + " -> " + produto.getNome());
        System.out.println("Valor R$ " + produto.getValor());
        System.out.println("Imposto " + Math.ceil((valor - produto.getValor())));
        System.out.println("Imposto a ser pago " + valor);

        if(produto instanceof  Tomate){
//            Tomate produto1 = (Tomate) produto;
            System.out.println("Data de validade " + ((Tomate) produto).getDataDeValidade());
        }

        System.out.println();
    }


//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatório de imposto do Computador");
//        double valor = computador.calculaImposto();
//        System.out.println("Computador -> " + computador.getNome());
//        System.out.println("Valor R$ " + computador.getValor());
//        System.out.println("Imposto " + Math.ceil((valor - computador.getValor())));
//        System.out.println("Imposto a ser pago " + valor);
//        System.out.println();
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatório de imposto do Tomate");
//        double valor = tomate.calculaImposto();
//        System.out.println("Tomate -> " + tomate.getNome());
//        System.out.println("Valor R$ " + tomate.getValor());
//        System.out.println("Imposto " + Math.ceil((valor - tomate.getValor())));
//        System.out.println("Imposto a ser pago " + valor);
//        System.out.println();
//    }

}
