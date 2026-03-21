package academy.devdojo.maratonajava.javacore.Gassossiacao.dominio;

public class Jogador {
    private String nome;
    private Time[] time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time[] time) {
        this.nome = nome;
        this.time = time;
    }

    public void imprime(){
        System.out.println("Nome jogador: " + this.nome);

        if(this.time == null){
            return;
        }

        for (Time time : this.time) {
            System.out.println(time.getNome());
        }

    }

    public void setTime(Time[] time) {
        this.time = time;
    }

    public void getTime() {
        if (this.time == null) {
            return;
        }

        for (Time time: this.time){
            System.out.println(time.getNome());
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
