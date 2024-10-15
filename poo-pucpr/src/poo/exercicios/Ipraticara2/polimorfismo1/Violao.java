package poo.exercicios.Ipraticara2.polimorfismo1;

public class Violao extends InstrumentoMusical {

    public Violao(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando violão");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando violão");
    }
}
