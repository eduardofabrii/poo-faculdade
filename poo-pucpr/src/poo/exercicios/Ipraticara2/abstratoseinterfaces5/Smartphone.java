package poo.exercicios.Ipraticara2.abstratoseinterfaces5;

public class Smartphone implements DispositivoEletronico {
    @Override
    public void desligar() {
        System.out.println("Desligando Smartphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Smartphone");
    }
}
