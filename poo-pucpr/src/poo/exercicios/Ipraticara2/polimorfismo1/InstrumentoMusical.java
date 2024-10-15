package poo.exercicios.Ipraticara2.polimorfismo1;

public abstract class InstrumentoMusical {
    private String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    public abstract void tocar();

    public abstract void afinar();
}
