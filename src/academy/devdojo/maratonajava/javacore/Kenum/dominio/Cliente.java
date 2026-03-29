package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {


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
                ", tiposPessoa=" + tiposPessoa.TIPO_PESSOA +
                ", tiposPessoaValor=" + tiposPessoa.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
