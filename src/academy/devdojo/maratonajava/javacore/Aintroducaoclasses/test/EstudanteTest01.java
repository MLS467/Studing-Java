package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Maisson Silva";
        estudante2.idade = 30;
        estudante2.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

}
