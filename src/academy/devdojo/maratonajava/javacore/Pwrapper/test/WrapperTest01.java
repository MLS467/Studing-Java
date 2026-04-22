package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

//    Tipos Primitivos    
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100D;
        char charP = 'x';
        boolean booleanP = true;


//    Classes Wrappers
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 1; // boxing
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 100D;
        Character charWrapper = 'x';
        Boolean booleanWrapper = true;


        int i = intWrapper; // unboxing

        Integer intw2 = Integer.parseInt("1");

        Boolean verdadeiro = Boolean.parseBoolean("TruE");
//        System.out.println(verdadeiro);

        // boxing é quando passa o tipo primitivo para o wrapper
        // Unboxing é quando passa do wrapper para o tipo primitivo


        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));

    }
}
