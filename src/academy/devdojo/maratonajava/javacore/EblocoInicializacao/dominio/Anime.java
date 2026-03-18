package academy.devdojo.maratonajava.javacore.EblocoInicializacao.dominio;

public class Anime {

    private String nome;
    private int[] episodios = new int[100];

    // 1 - Alocado espaco de memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização!");
    }


    public Anime(String nome) {
        this();
        this.nome = nome;
        System.out.println("Dentro do construtor");
        this.imprime();
    }


    public Anime() {
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i + 1;
        }
    }


    private void imprime() {
        for (int ep : this.episodios)
            System.out.print(ep + " ");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int[] getEpisodios() {
        return episodios;
    }


    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
