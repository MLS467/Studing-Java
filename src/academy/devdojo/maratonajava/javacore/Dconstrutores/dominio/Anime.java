package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private String genero;
    private int episodios;
    private String estudio;

    public Anime() {
        System.out.println("Dentro do sem args");
    }

    public Anime(String tipo, String nome, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String tipo, String nome, int episodios, String genero, String estudio) {
        this(tipo, nome, episodios,genero);
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
