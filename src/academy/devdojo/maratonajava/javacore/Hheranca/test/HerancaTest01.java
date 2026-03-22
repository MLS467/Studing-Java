package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

    // 0 - Bloco de inicialização static é executado quando a JVM carregar classe superclasse
    // 1 - Bloco de inicialização static é executado quando a JVM carregar classe subclasse
    // 2 - Alocado espaco de memória para classe pai
    // 3 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe superclasse
    // 4 - Bloco de inicialização é executado da superclasse na ordem em que aparece
    // 5 - Bloco de inicialização é executado da subclasse
    // 6 - Construtor é executado
    // 7 - Alocado espaco de memória para classe subclasse
    // 8 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe subclasse
    // 9 - Bloco de inicialização é executado da superclasse na ordem em que aparece
    // 10 - Bloco de inicialização é executado da subclasse
    // 11 - Construtor é executado

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("05256655");

        Pessoa pessoa = new Pessoa("Ronaldo");
        pessoa.setCpf("0252525");
        Funcionario funcionario = new Funcionario("Ricardo");
        funcionario.setEndereco(endereco);
        funcionario.setCpf("55555");
        funcionario.setSalario(2565.56);


        funcionario.imprime();

    }
}
