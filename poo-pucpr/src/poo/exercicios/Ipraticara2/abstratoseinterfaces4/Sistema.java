package poo.exercicios.Ipraticara2.abstratoseinterfaces4;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<Transporte> transportes = new ArrayList<>();

        transportes.add(new Aviao());
        transportes.add(new Trem());
        transportes.add(new Barco());

        Transporte t1 = transportes.get(0);
        Transporte t2 = transportes.get(1);
        Transporte t3 = transportes.get(2);

        t1.viajar();
        t1.parar();
        ((Aviao) t1).turbulencia();

        t2.viajar();
        t2.parar();

        t3.viajar();
        t3.parar();
    }
}
