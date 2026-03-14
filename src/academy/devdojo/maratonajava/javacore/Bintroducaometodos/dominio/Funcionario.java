package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (this.salarios != null) {
            for (double i : this.salarios) {
                System.out.println("R$ " + i);
            }
            return;
        }
        System.out.println("Sem salário.");
    }


    public void mediaSalario() {
        double total = 0;

        if (this.salarios != null) {
            for (double i : this.salarios) {
                total += i;
            }
            System.out.println(total / this.salarios.length);
            return;
        }

        System.out.println("Sem salário.");
    }
}
