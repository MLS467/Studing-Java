package academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.dominio;

public class Aluno {
    private String nome;
    private Seminario seminario;

    public Aluno(String nome, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("\n -------- Aluno(s) -----------");
        System.out.println("Nome " + this.nome);
        System.out.println("Seminário " + this.seminario.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
