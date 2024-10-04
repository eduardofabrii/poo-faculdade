package poo.exercicios.Fnetflixemgrupo.usuario;

import poo.exercicios.Fnetflixemgrupo.pagamento.Pagamento;

public class Premium extends Usuario {
    private boolean downloadOffline;

    public Premium(String nome, String email, String senha, String dataNascimento, boolean downloadOffline) {
        super(nome, email, senha, dataNascimento);
        this.downloadOffline = downloadOffline;
    }

    public boolean isDownloadOffline() {
        return downloadOffline;
    }

    public void setDownloadOffline(boolean downloadOffline) {
        this.downloadOffline = downloadOffline;
    }
}