package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.SomaDoisNumeros();

        calc.subtraiDoisNumeros();

        calc.multiplicaDoisNumeros(4, 6);

        double resultado = calc.divideDoisNumeros(10, 2.5);

        if (resultado == 0.0) {
            System.out.println("Divisão por zero não é possível");
        } else {
            System.out.println(resultado);
        }

        int[] valores = {20,10,50,60};
//        calc.somaVarArgs(2,1,3,5);
        calc.somaVarArgs(valores);
    }
}
