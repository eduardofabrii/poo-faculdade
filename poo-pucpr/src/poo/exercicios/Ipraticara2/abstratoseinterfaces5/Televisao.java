package poo.exercicios.Ipraticara2.abstratoseinterfaces5;

public class Televisao implements DispositivoEletronico {
    @Override
    public void desligar() {
        System.out.println("Desligando Televisao");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Televisao");
    }
}
