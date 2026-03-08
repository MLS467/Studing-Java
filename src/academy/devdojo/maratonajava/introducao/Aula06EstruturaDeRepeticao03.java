package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {

    public static void main(String[] args) {
        int valor = 50;
        int inicio = 0;
        int passo = 1;

        for(int count = inicio; count <= valor; count+=passo ) {

            if(count  <= 25){
                System.out.println(count);
                continue;
            }
                break;
        }
    }



}
