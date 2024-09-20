package poo.exercicios.Fnetflixemgrupo.usuario;

import poo.exercicios.Fnetflixemgrupo.pagamento.Pagamento;

public class Premium extends Usuario {
    private boolean downloadOffline;

    public Premium(String nome, String email, String senha, String dataNascimento, Pagamento pagamento, boolean downloadOffline) {
        super(nome, email, senha, dataNascimento, pagamento);
        this.downloadOffline = downloadOffline;
    }

    public Premium(String nome, String email, Pagamento pagamento, boolean downloadOffline) {
        super(nome, email);
        this.downloadOffline = downloadOffline;
    }
}
