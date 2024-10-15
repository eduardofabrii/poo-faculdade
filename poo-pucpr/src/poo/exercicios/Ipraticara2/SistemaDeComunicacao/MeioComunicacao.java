package poo.exercicios.Ipraticara2.SistemaDeComunicacao;

public abstract class MeioComunicacao implements Mensagem {
    public void enviar() {
        System.out.println("Enviando...");
    }

    public abstract void enviarMensagemPrioritaria();
}
