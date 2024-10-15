package poo.exercicios.Ipraticara2.abstratoseinterfaces4;

public class Barco implements Transporte {
    @Override
    public void viajar() {
        System.out.println("Viajando de barco");
    }

    @Override
    public void parar() {
        System.out.println("Parando de viajar com o barco");
    }
}
