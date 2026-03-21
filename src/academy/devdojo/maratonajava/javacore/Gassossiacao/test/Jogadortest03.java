package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Time;

public class Jogadortest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador};
        Time[] times = {time};

        time.setJogadores(jogadores);
        jogador.setTime(times);

        System.out.println("------Time--------");
        time.imprime();
        System.out.println();

        System.out.println("------Jogador--------");
        jogador.imprime();
        System.out.println();


    }
}
