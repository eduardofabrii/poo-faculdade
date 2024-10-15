package poo.exercicios.Ipraticara2.abstratoseinterfaces2;

public class SMS extends MeioComunicacao {
    public SMS(String remetente, String destinatario) {
        super(remetente, destinatario);
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando SMS de " + getRemetente() + " para " + getDestinatario());
    }
}
