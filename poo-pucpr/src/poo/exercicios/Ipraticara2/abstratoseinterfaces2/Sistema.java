package poo.exercicios.Ipraticara2.abstratoseinterfaces2;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<MeioComunicacao> meios = new ArrayList<>();

        meios.add(new Email("Eduardo", "José"));
        meios.add(new Email("José", "Eduardo"));
        meios.add(new SMS("Paulo", "Pedro"));
        meios.add(new SMS("Pedro", "Paulo"));
        meios.add(new WhatsApp("Junior", "Julia"));
        meios.add(new WhatsApp("Julia", "Junior"));

        MeioComunicacao um = meios.get(0);
        MeioComunicacao dois = meios.get(1);
        MeioComunicacao tres = meios.get(2);
        MeioComunicacao quatro = meios.get(3);
        MeioComunicacao cinco = meios.get(4);
        MeioComunicacao seis = meios.get(5);

        um.enviarMensagem();
        dois.enviarMensagem();


    }
}
