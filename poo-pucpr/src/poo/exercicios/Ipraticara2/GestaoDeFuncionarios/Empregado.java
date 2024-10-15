package poo.exercicios.Ipraticara2.GestaoDeFuncionarios;

public abstract class Empregado implements Funcionario {
    private String nome;
    protected double salario;

    public abstract void calcularSalario();

    public Empregado(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome() + " - " +
                "Salario: " + getSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
