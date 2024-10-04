package poo.exercicios.Fnetflixemgrupo.usuario;


import poo.exercicios.Fnetflixemgrupo.pagamento.Pagamento;

public class Basico extends Usuario {
    private int anuncios;

    public Basico(String nome, String email, String senha, String dataNascimento, int anuncios) {
        super(nome, email, senha, dataNascimento);
        this.anuncios = anuncios;
    }

    public Basico(String nome, String email, String senha, int anuncios) {
        super(nome, email, senha);
        this.anuncios = anuncios;
    }

    public int getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(int anuncios) {
        this.anuncios = anuncios;
    }
}