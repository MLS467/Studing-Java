package academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.dominio;

public class Anime {

    private String nome;
    private static int[] episodios = new int[100];
    // 0 - Bloco de inicialização é executado quando a JVM carregar classes
    // 1 - Alocado espaco de memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado


    // sendo static é iniciado apenas uma vez
    static {
        System.out.println("Dentro do bloco de inicialização!");
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }


    public Anime(String nome) {
        this();
        this.nome = nome;
        System.out.println("Dentro do construtor");
        this.imprime();
    }


    public Anime() {
        this.imprime();
    }

    private void imprime() {
        for (int ep : Anime.episodios)
            System.out.print(ep + " ");

        System.out.println();
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

}
