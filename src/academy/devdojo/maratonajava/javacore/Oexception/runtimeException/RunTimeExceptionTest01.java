package academy.devdojo.maratonajava.javacore.Oexception.runtimeException;

public class RunTimeExceptionTest01 {

    public static void main(String[] args) {
        // Throwable
        // ERROR / EXCEPTION

        // 1. Dentro das exception temos as Checked and Unchecked
        //-------------------------------------------------------------------------------------------


        // Throwable -> Exception
        // Checked Exception -> são exeções que devem obrigatóriamente ter uma tratamento



        // 2. Uncheked Exception -> são exeções que não necessáriamente precisa ter um tratamento obrigatório.
        //----------------------------------------------------------------------------------------------

        // Throwable -> Exception -> RunTimeException
        // erros do programador

        Object obj = null;

//        System.out.println(obj.toString()); // dever ser um NullPointerException pois não existe obj

        int[] num = {1, 2, 3};

//        System.out.println(num[3]); deve ser  ArrayIndexOutOfBoundsException
//------------------------------------------------------------------------------------------------------------
    }

}
