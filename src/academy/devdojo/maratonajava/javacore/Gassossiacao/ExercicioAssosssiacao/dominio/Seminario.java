package academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void imprime() {
        System.out.println("\n -------- Seminário -----------");
        System.out.println("Título Seminário: " + this.titulo);
        this.local.imprime();

        if (this.alunos == null) {
            return;
        }

        for (Aluno aluno : this.alunos) {
            aluno.imprime();
        }
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
