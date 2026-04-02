package academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando dados no arquivo.");
    }
}
