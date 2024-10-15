package poo.exercicios.Ipraticara2.GestaoDeFuncionarios;

public class Assistente extends Empregado {
    private final String CARGO = "Assistente";

    public Assistente(String nome) {
        super(nome);
    }

    @Override
    public void calcularSalario() {
        setSalario(2000);
        exibirDetalhes();
    }
}
