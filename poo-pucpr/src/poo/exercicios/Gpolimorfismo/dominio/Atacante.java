package poo.exercicios.Gpolimorfismo.dominio;

public class Atacante extends Jogador {
    private int gols;

    public Atacante(String nome, int idade, Time time, int gols) {
        super(nome, idade, time);
        this.gols = gols;
    }

    @Override
    public void chutar() {
        System.out.println("Chutando");
    }

    public void chutarProGol() {
        System.out.println("Gol!");
        gols++;
    }

    public int getGols() {
        return gols;
    }
}
