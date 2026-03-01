package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para o campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>
confirmo que recebi o salario de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
     String nome = "Maisson Leal da Silva";
     String endereco = "Rua bolada dos Boladões";
     double salario = 3654.85;
     String dataRecebimentoSalario = "01/03/2026";

     String relatorio = "Eu " + nome+ ", morando no endereço "+endereco + "\n" +
             " confirmo que recebi o salario de " + salario + ", na dataRecebimentoSalario " + dataRecebimentoSalario;


        System.out.println(relatorio);
    }
}


