package academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.dominio.Seminario;

import java.util.Scanner;

public class ExercicioAssossiacaoTest01 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Nome do Local: ");
        String nomeLocal = dados.nextLine();

        System.out.println("Nome do Seminario: ");
        String nomeSeminario = dados.nextLine();

        System.out.println("Nome do Aluno1: ");
        String nomeAluno1 = dados.nextLine();

        System.out.println("Nome do Aluno2: ");
        String nomeAluno2 = dados.nextLine();

        System.out.println("Nome do Professor: ");
        String nomeProfessor = dados.nextLine();

        System.out.println("Nome da especialidade: ");
        String nomeEspecialidade = dados.nextLine();


        Local local = new Local(nomeLocal);

        Professor professor = new Professor(nomeProfessor, nomeEspecialidade);

        Seminario seminario_ldp = new Seminario(nomeSeminario);

        Aluno aluno = new Aluno(nomeAluno1, seminario_ldp);
        Aluno aluno2 = new Aluno(nomeAluno2, seminario_ldp);


        seminario_ldp.setAlunos(new Aluno[]{aluno, aluno2});
        seminario_ldp.setLocal(local);

        professor.setSeminario(new Seminario[]{seminario_ldp});
        professor.imprime();

    }
}
