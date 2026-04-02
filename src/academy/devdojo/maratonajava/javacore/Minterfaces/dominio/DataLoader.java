package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // private -> default -> protected -> public

    // Todas os atributos de uma interface são constantes por isso é redundante o public static final
    public static final int MAX_DATA_SIZE = 10;

    // public abstract é redundante
    public abstract void load();

    // public é redundante
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissão.");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}