package poo.exercicios.Fnetflixemgrupo.usuario;


import poo.exercicios.Fnetflixemgrupo.pagamento.Pagamento;

public class Basico extends Usuario {
    private int anuncios;

    public Basico(String nome, String email, String senha, String dataNascimento, Pagamento pagamento, int anuncios) {
        super(nome, email, senha, dataNascimento, null);
        this.anuncios = anuncios;
    }

    public Basico(String nome, String email) {
        super(nome, email);
    }
}
