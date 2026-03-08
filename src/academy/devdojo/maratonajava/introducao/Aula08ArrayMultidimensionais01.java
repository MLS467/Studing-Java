package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais01 {

    public static void main(String[] args) {

        int[][] numeros = new int[3][3];

        numeros[0][0] = 10;
        numeros[0][1] = 20;
        numeros[0][2] = 30;

        numeros[1][0] = 40;
        numeros[1][1] = 50;
        numeros[1][2] = 60;

        numeros[2][0] = 70;
        numeros[2][1] = 80;
        numeros[2][2] = 90;

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length ; j++) {
                System.out.println(numeros[i][j]);
            }

        }
        System.out.println("--------------------------");


        for (int[] numeroArray: numeros){
            for (int num : numeroArray){
                System.out.println(num);
            }
        }
    }
}
