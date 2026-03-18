package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setIdade(0);
        pessoa.setNome("");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
