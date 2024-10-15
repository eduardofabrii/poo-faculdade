package poo.exercicios.Ipraticara2.abstratoseinterfaces2;

public class Email extends MeioComunicacao {

    public Email(String remetente, String destinatario) {
        super(remetente, destinatario);
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando email de " + getRemetente() + " para " + getDestinatario());
    }
}
