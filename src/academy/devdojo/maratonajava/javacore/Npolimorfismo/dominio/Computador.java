package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto implements Taxavel{
    public static final double TAXA_POR_CENTO = 0.21;

    public Computador(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando o imposto do Computador.");
        return this.valor + this.valor * TAXA_POR_CENTO;
    }
}
