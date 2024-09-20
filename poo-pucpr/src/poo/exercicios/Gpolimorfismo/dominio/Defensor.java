package poo.exercicios.Gpolimorfismo.dominio;

public class Defensor extends Jogador {
    private int desarmes;

    public Defensor(String nome, int idade, Time time, int desarmes) {
        super(nome, idade, time);
        this.desarmes = desarmes;
    }

    @Override
    public void chutar() {
        System.out.println("Chutando");
    }

    public void desarmar() {
        System.out.println("Desarmando");
        this.desarmes++;
    }

    public int getDesarmes() {
        return desarmes;
    }
}
