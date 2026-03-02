package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade > 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        String categoria;

        if(idade >= 18){
            categoria = "Categoria Adulta";
        }else if(idade >= 15){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Infantil";
        }

        System.out.println(categoria);
    }

}
