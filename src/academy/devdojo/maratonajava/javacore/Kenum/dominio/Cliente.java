package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TiposPessoa tipoCliente;

    public Cliente(String nome, TiposPessoa tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {

        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TiposPessoa getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TiposPessoa tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
