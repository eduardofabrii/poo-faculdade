package poo.exercicios.Ipraticara2.abstratoseinterfaces4;

public class Aviao implements Transporte {
    @Override
    public void viajar() {
        System.out.println("Levantando voo com avião");
    }

    @Override
    public void parar() {
        System.out.println("Pousando o avião");
    }

    public void turbulencia() {
        System.out.println("O avião está em turbulencia!!!!!!");
    }
}
