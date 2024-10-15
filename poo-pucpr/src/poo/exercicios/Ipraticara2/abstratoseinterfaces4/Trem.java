package poo.exercicios.Ipraticara2.abstratoseinterfaces4;

public class Trem implements Transporte {
    @Override
    public void viajar() {
        System.out.println("Viajando de trem");
    }

    @Override
    public void parar() {
        System.out.println("Parando de viajar com o trem");
    }
}
