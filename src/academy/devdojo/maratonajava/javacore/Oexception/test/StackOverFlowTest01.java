package academy.devdojo.maratonajava.javacore.Oexception.test;

public class StackOverFlowTest01 {

    public static void main(String[] args) {
       stackOverFlow();
    }

    public static void stackOverFlow(){
        stackOverFlow();
    }
}
