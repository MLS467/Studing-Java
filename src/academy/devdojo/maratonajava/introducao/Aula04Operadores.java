package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args){

        // + - * /

        int numero01 = 10;
        // double numero02 = 20; // divisão de números será inteiro resultado 0.0
        int numero02 = 20;

        double resultado = numero01 / (double) numero02;


        // %
        int numero = 20;
        int divisor = 2;
        boolean isPar = numero % divisor == 0;

        // lógicos  < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;


//        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
//        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
//        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
//        System.out.println("isDezIgualDez " + isDezIgualDez);
//        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);



//        Operadores lógicos

//        && || !

            int idade = 20;
            float salario = 3500F;

            boolean isMaiorDentroDaLei = idade >= 30 && salario > 4500;
            boolean isMenorDentroDaLei = idade <= 20 && salario > 2500;

//        System.out.println("isMaiorDentroDaLei " +isMaiorDentroDaLei);
//        System.out.println("isMenorDentroDaLei " +isMenorDentroDaLei);



        double valorTotalContaCorrente = 200.0D;
        double valorTotalContaPoupanca = 10000.0D;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = (valorTotalContaCorrente >=  valorPlaystation
                || valorTotalContaPoupanca >= valorPlaystation);

//        System.out.println(isPlaystationCincoCompravel);


//        =, +=, -=, *=, /=, %=

        double bonus = 1000;

        bonus +=  1100;
        bonus -= 200;
        bonus *= 2;

        bonus %= 2;

//        System.out.println(bonus);

        // ++ --

        int contador = 0;
        contador += 1;
        contador++;

        System.out.println(contador);

        contador--;

        System.out.println(contador);
        System.out.println(++contador);
        System.out.println(contador++);
        System.out.println(contador);

    }
}
