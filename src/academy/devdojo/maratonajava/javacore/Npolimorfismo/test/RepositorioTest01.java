package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Servico.RepositorioBancoDeDados;

public class RepositorioTest01 {



    public static void main(String[] args){

        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();



    }
}
