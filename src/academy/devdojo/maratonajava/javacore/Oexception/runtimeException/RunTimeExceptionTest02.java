package academy.devdojo.maratonajava.javacore.Oexception.runtimeException;

public class RunTimeExceptionTest02 {

    public static void main(String[] args) {
//        double resultado = divisor(4, 0);
//        System.out.println(resultado);

        try {
            double resultado = divisor(4, 0);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("#TESTECHEGOU \u0354");
    }

    /***
     * @param x é o dividendo
     * @param y é o divisor, não podendo ser 0
     * @return divisão
     * @throws ArithmeticException caso y seja 0
     */
    public static double divisor(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Argumento inválido.");
        }

        return x / y;
    }
}
