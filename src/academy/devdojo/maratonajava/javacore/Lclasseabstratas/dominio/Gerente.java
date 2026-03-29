package academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio;

import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Funcionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario += this.salario * 0.10;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }
}
