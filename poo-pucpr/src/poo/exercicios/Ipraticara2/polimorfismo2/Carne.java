package poo.exercicios.Ipraticara2.polimorfismo2;

public class Carne extends Alimento {
    @Override
    public void preparar() {
        System.out.println("Preparando Carne");
    }

    @Override
    public void consumir() {
        System.out.println("Consumindo Fruta");
    }
}
