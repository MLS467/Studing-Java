package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    static{
        System.out.println("Dentro do bloco de incialização estático de pessoa.");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe pessoa 1.");
    }
    {
        System.out.println("Dentro do bloco de inicialização da classe pessoa 2.");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println("Endereço " + this.endereco.getRua() + " Cep: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
