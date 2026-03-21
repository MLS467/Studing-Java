package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import java.util.Scanner;

public class LendoDadosDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = dados.nextLine();

        System.out.println("Digite sua Idade:");
        int idade = dados.nextInt();

        System.out.println("Digite seu sexo:");
        char sexo = dados.next().charAt(0);

        String complemento = " Muito bem por chegar até aqui!";

        System.out.println("Nome: " + nome  +" Sexo: " + sexo + " Idade: " + idade + complemento);
    }
}
