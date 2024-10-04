package poo.exercicios.Fnetflixemgrupo.streaming;

public class Serie extends Streaming {
    private int temporadas;
    private int episodios;

    public Serie(String titulo, String genero, int classificacaoEtaria, String lancamento, int duracao, int temporadas, int episodios) {
        super(titulo, genero, classificacaoEtaria, lancamento, duracao);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public Serie() {
    }

    @Override
    public String toString() {
        return "Serie | " +
                "Título: " + getTitulo() + " | " +
                "Gênero: " + getGenero() + " | " +
                "Duração: " + getDuracao() + " minutos" + " | " +
                "Temporadas: " + temporadas + " | " +
                "Episódios: " + episodios + " | " +
                "Classificação Etária: " + getClassificacaoEtaria();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
