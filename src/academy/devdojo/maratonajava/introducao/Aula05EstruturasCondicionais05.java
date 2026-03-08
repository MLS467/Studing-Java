package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {

    public static void main(String[] args) {
        // Imprima o dia da semana, considerando o 1 como domingo

        byte dia = 10;
        String resultado;

        switch (dia) {
            case 1:
                resultado = "Domingo";
                break;
            case 2:
                resultado = "Segunda-Feira";
                break;
            case 3:
                resultado = "Terça-Feira";
                break;
            case 4:
                resultado = "Quarta-Feira";
                break;
            case 5:
                resultado = "Quinta-Feira";
                break;
            case 6:
                resultado = "Sexta-Feira";
                break;
            case 7:
                resultado = "Sábado";
                break;
            default:
                resultado = "Dia não identificado";
                break;
        }

        System.out.println(resultado);
    }
}
