package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import java.io.*;

public class TryWithResourcersTest01 {

    public static void main(String[] args) {

    }


    // Exemplo de TryWithResources
    public static void lerAquivo1(){
        // o proprio java vai fechar
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }catch (IOException e){

        }
    }


    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("texte.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
