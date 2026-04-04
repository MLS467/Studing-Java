package academy.devdojo.maratonajava.javacore.Oexception.Error.test;

public class StackOverFlowTest01 {

    public static void main(String[] args) {
       stackOverFlow();
    }

    public static void stackOverFlow(){
        stackOverFlow();
    }
}
