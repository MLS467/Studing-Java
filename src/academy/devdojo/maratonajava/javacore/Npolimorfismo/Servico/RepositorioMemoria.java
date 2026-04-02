package academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando dados em memória.");
    }
}
