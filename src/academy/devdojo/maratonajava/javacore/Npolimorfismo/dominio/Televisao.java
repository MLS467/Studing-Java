package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double TAXA_POR_CENTO = 0.21;

    public Televisao(String nome, double valor){
        super(nome,valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando o imposto do Televisao");
        return this.valor + this.valor * TAXA_POR_CENTO;
    }
}
