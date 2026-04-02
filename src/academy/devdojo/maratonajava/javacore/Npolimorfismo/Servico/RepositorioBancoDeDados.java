package academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando dados no banco de dados.");
    }
}
