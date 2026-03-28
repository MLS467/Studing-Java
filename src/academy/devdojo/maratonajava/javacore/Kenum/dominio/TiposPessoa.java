package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TiposPessoa {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String TIPO_PESSOA;

     TiposPessoa(int valor, String tipoPessoa){
         this.VALOR = valor;
         this.TIPO_PESSOA = tipoPessoa;
    }
}
