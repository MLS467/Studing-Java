package academy.devdojo.maratonajava.javacore.Oexception.runtimeException;

public class RunTimeExceptionTest03 {

    public static void main(String[] args) {
        System.out.println(abreConexao());
    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
//            throw new Exception();
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return "String";
    }

}
