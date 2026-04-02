package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto implements Taxavel{
    public static final double TAXA_POR_CENTO = 0.06;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando o imposto do Tomate");
        return this.valor + this.valor * TAXA_POR_CENTO;
    }
}

