package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    public enum TipoPagamento{
        DEBITO, CREDITO
    }

    private String nome;
    private TiposPessoa tiposPessoa;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TiposPessoa tiposPessoa, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tiposPessoa = tiposPessoa;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tiposPessoa=" + tiposPessoa +
                ", tiposPessoaValor=" + tiposPessoa.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
