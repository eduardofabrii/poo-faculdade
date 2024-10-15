package poo.exercicios.Ipraticara2.GestaoDeFuncionarios;

public class Analista extends Empregado {
    private final String CARGO = "Analista";

    public Analista(String nome) {
        super(nome);
    }

    @Override
    public void calcularSalario() {
        this.setSalario(2600);
        exibirDetalhes();
    }
}
