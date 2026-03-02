package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double salarioComImposto;

        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;


        if (salarioAnual <= 34712) {
            salarioComImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            salarioComImposto = salarioAnual * segundaFaixa;
        } else {
            salarioComImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(salarioComImposto);
    }
}
