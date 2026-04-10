package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private static void criarNovoArquivo() throws IOException {
//        File file = new File("Arquivo\\teste.txt");
//        Boolean isCreateFile = file.createNewFile();
//        System.out.println("Arquivo criado -> " + (isCreateFile ? "Criado" : "Não criado"));
//    }

    private static void criarNovoArquivo() throws IOException {
        try {
            File file = new File("Arquivo\\teste.txt");
            Boolean isCreateFile = file.createNewFile();
            System.out.println("Arquivo criado -> " + (isCreateFile ? "Criado" : "Não criado"));
        } catch (IOException e) {
            e.printStackTrace();
            throw e; // relançando para capturar e tratar como quiser em outros métodos.
        }
    }
}
