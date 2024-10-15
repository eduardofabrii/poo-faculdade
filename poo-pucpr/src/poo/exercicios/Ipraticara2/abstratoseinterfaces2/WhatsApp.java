package poo.exercicios.Ipraticara2.abstratoseinterfaces2;

public class WhatsApp extends MeioComunicacao {
    public WhatsApp(String remetente, String destinatario) {
        super(remetente, destinatario);
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem WhatsApp de " + getRemetente() + " para " + getDestinatario());
    }
}
