package academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime(){
        if(seminario == null) return;

        System.out.println("\n -------- Professor(es) -----------");
        System.out.println("Professor: " + this.nome + " Especialista: " + this.especialidade);
        for (Seminario seminario : this.seminario) {
            seminario.imprime();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
