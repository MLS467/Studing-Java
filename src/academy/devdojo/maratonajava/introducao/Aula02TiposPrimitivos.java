package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
  public static void main(String[] args){
        // int, double , float, char, byte, short, long, boolean

        int idade = 55;
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2000;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';
        char ASCII = 65;
        char UNICODE = '\u0041';
        String nome = "Goku";
        var nome2 = "Vegeta"; // não funciona no java 8 só a partir do 10


      System.out.println("Oi, meu nome é " + nome2);
  }
}
