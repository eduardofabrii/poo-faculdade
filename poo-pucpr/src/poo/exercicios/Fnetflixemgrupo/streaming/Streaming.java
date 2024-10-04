package poo.exercicios.Fnetflixemgrupo.streaming;

public class Streaming {
    private String titulo;
    private String genero;
    private int classificacaoEtaria;
    private String lancamento;
    private int duracao;

    public Streaming(String titulo, String genero, int classificacaoEtaria, String lancamento, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
        this.lancamento = lancamento;
        this.duracao = duracao;
    }

    public Streaming(String titulo, int duracao, String genero, int classificacaoEtaria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public Streaming() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
