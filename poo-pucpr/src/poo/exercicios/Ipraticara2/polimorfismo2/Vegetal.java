package poo.exercicios.Ipraticara2.polimorfismo2;

public class Vegetal extends Alimento {
    @Override
    public void preparar() {
        System.out.println("Preparando Vegetal");
    }

    @Override
    public void consumir() {
        System.out.println("Consumindo Vegetal");
    }
}
