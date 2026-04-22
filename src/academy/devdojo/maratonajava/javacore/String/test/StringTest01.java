package academy.devdojo.maratonajava.javacore.String.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Maisson"; // String constant pool
        String nome2 = "Maisson";
        nome = nome.concat(" da Silva");

        System.out.println(nome == nome2);
        System.out.println(nome);

        String nome3 = new String("Maisson");
        System.out.println(nome2 == nome3.intern());
    }
}
