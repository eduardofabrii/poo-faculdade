package poo.exercicios.Ipraticara2.abstratoseinterfaces5;

public class Computador implements DispositivoEletronico {
    @Override
    public void desligar() {
        System.out.println("Desligando Computador");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Computador");
    }
}
