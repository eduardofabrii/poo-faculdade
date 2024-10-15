package poo.exercicios.Ipraticara2.polimorfismo1;

public class Piano extends InstrumentoMusical {
    public Piano(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando piano");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando piano");
    }
}
