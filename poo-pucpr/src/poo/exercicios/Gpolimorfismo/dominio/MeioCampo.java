package poo.exercicios.Gpolimorfismo.dominio;

public class MeioCampo extends Jogador {
    private int assistencias;

    public MeioCampo(String nome, int idade, Time time, int assistencias) {
        super(nome, idade, time);
        this.assistencias = assistencias;
    }

    public MeioCampo(String nome, int idade, int assistencias) {
        super(nome, idade);
        this.assistencias = assistencias;
    }

    @Override
    public void chutar() {
        System.out.println("Chutando");
    }

    public void darAssistencia() {
        System.out.println("Dando assistencia");
        this.assistencias++;
    }

    public int getAssistencias() {
        return assistencias;
    }
}
