package academy.devdojo.maratonajava.javacore.Lclasseabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Anami", 5000);
        Desenvolvedor dev = new Desenvolvedor("Soya", 12000);

        System.out.println(gerente);
        System.out.println(dev);
    }
}
