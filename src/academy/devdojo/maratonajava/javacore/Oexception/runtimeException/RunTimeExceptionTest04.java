package academy.devdojo.maratonajava.javacore.Oexception.runtimeException;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {


    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("DENTRO DO ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("DENTRO DO IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("DENTRO DO IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("DENTRO DO ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("DENTRO DO RuntimeException");
        }

        // Tratando excessões do tipo checked
        try{
            talvezLance();
        }catch (SQLException  e){
            e.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    /**
     *
     * @throws SQLException
     * @throws FileNotFoundException
     */
    private static void talvezLance() throws SQLException, FileNotFoundException{

    }

}
