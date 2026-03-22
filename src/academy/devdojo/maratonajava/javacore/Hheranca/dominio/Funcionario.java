package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;


    static{
        System.out.println("Dentro do bloco de incialização estático de funcionário.");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe funcionário 1.");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe funcionário 2.");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
