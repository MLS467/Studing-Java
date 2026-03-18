package academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    // valor pertence a classe carro e não ao objeto mais então muda em todos
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("------------------");
        System.out.println("Nome -> " + this.nome);
        System.out.println("velocidadeMaxima -> " + this.velocidadeMaxima);
        System.out.println("velocidadeLimite -> " + Carro.velocidadeLimite);
    }


    public String getNome() {
        return nome;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public  static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

}
