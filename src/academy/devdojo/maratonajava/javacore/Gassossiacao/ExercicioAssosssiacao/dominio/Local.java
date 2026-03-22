package academy.devdojo.maratonajava.javacore.Gassossiacao.ExercicioAssosssiacao.dominio;

public class Local {
    private String endereco;


    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("\n -------- Local -----------");
        System.out.println("Local: " + this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
