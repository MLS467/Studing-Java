package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Anime;

public class Animetest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV", 15, "Ação" );
        anime.imprime();
    }
}