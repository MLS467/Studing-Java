package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

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

        if (this.salarios != null) {
            for (double i : this.salarios) {
                this.media += i;
            }
            System.out.println(this.media / this.salarios.length);
            return;
        }

        System.out.println("Sem salário.");
    }



    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
