package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05 {

// horrível conta de 30.000 até 30 para o resultado dar 1000
    public static void main(String[] args) {

        double valorCarro = 30000;
        double valorParcela = 1000;
int contagem = 0;

        for (int count = (int) valorCarro; count > 1; count--) {

            double resultado = valorCarro / count;

            if(resultado < 1000){
                System.out.println("contagem antes " + resultado + " contagem " + contagem );
                contagem++;
                continue;
            }

            System.out.println("Em "+count+" Parcela(s) de " + "R$"+resultado);
        }


    }

}
