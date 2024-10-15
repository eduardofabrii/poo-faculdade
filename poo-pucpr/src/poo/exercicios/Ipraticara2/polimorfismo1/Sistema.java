package poo.exercicios.Ipraticara2.polimorfismo1;

import poo.exercicios.Ztestes.A;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<InstrumentoMusical> instrumentos = new ArrayList<>();

        instrumentos.add(new Violao("Vilão"));
        instrumentos.add(new Piano("Piano"));
        instrumentos.add(new Guitarra("Guitarra"));

        for (InstrumentoMusical i : instrumentos) {
            i.tocar();
            i.afinar();
            System.out.println(" ");
        }
    }
}
