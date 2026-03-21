package academy.devdojo.maratonajava.javacore.Gassossiacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void imprime(){
        System.out.println("Nome time: " + this.nome);

        if(this.jogadores == null){
            return;
        }

        for (Jogador jogadore : this.jogadores) {
            System.out.println(jogadore.getNome());
        }

    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
