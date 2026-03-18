package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class Animetest {
    public static void main(String[] args) {
        Anime anime = new Anime("TV", "DBZ", 150, "Ação", "Bazinga");
        anime.imprime();
    }
}