package poo.exercicios.Ipraticara2.polimorfismo1;

public class Guitarra extends InstrumentoMusical {
    public Guitarra(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando guitarra");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando guitarra");
    }
}
