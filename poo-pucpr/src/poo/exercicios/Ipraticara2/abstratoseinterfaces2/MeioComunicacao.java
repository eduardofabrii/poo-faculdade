package poo.exercicios.Ipraticara2.abstratoseinterfaces2;

public abstract class MeioComunicacao {
    private String remetente;
    private String destinatario;

    public MeioComunicacao(String remetente, String destinatario) {
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public abstract void enviarMensagem();

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
