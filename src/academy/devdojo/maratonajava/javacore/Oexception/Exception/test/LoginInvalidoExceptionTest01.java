package academy.devdojo.maratonajava.javacore.Oexception.Exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.Exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {

    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("Continua mermão");
    }

    private static void login() throws LoginInvalidoException {
        String usernameDB = "Goku";
        String passwordDB = "ssj4";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usernameDigitado = teclado.nextLine();

        System.out.print("Digite a senha: ");
        String passwordDigitado = teclado.nextLine();


        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Login inválido papai");
        }

        System.out.println("Senha correta");
    }
}
