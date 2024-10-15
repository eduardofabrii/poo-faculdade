package poo.exercicios.Ipraticara2.polimorfismo2;

public class Fruta extends Alimento {
    @Override
    public void preparar() {
        System.out.println("Preparando Fruta");
    }

    @Override
    public void consumir() {
        System.out.println("Consumindo Fruta");
    }
}
