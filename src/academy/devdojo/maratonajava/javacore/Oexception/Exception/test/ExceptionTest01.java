package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("Arquivo\\teste.txt");

        try {
            Boolean isCreateFile = file.createNewFile();
            System.out.println("Arquivo criado -> " + (isCreateFile ? "Criado" : "Não criado"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Continuou mesmo com após a excessão ser lançada.");
    }
}
