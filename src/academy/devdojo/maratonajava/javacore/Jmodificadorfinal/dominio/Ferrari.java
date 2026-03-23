package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public final class Ferrari {
    public  String nome;

    public Ferrari() {
    }

    public Ferrari(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
