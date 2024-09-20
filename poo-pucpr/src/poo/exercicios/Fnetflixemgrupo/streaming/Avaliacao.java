package poo.exercicios.Fnetflixemgrupo.streaming;

import poo.exercicios.Fnetflixemgrupo.usuario.Usuario;

public class Avaliacao {
    private Usuario usuario;
    private Streaming conteudo;  // filme ou série
    private int nota;  // 1 a 5 estrelas

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Streaming getConteudo() {
        return conteudo;
    }

    public void setConteudo(Streaming conteudo) {
        this.conteudo = conteudo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
