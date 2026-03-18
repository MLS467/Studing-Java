package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Professor;

public class EscolaTest {

    public static void main(String[] args) {
        Escola escola = new Escola("Konoha");
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Tenkashi Sensei");

        escola.setProfessores(new Professor[]{professor1,professor2});

        escola.imprime();
    }

}
