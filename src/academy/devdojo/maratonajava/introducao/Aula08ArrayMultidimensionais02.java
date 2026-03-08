package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais02 {


    public static void main(String[] args) {

        int[][] numeros = new int[3][];

        numeros[0] = new int[2];
        numeros[1] = new int[3];
        numeros[2] = new int[4];

        numeros[0][0] = 50;
        numeros[0][1] = 55;

        numeros[1][0] = 60;
        numeros[1][1] = 65;
        numeros[1][2] = 70;

        numeros[2][0] = 80;
        numeros[2][1] = 85;
        numeros[2][2] = 90;
        numeros[2][3] = 100;


        for (int[] num:numeros){
            for (int numero:num){
                System.out.println(numero);
            }
        }


    }


}
