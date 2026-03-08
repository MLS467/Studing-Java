package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {

    public static void main(String[] args) {

        double valorCarro = 30000;
        double valorParcela = 1000;


        for (int count = 1; count < valorCarro; count++) {
                double resultado = valorCarro / count;

                if(resultado < 1000){
                    break;
                }

            System.out.println("Em "+count+" Parcela(s) de " + "R$"+resultado);
        }

    }


}
