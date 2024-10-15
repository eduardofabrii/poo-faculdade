package poo.exercicios.Ipraticara2.GestaoDeFuncionarios;

public class Gerente extends Empregado {
    private final String CARGO = "Gerente";

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public void calcularSalario() {
        this.setSalario(3000);
        exibirDetalhes();
    }
}
