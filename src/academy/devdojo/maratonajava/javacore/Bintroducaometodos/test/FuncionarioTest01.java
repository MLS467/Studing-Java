package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();

        func1.setSalarios(new double[]{1500, 2500.25, 4000});
        func1.setNome("Maisson");
        func1.setIdade(31);

        func1.imprimeDados();

        func1.mediaSalario();
    }
}
