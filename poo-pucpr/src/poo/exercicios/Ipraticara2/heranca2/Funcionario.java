package poo.exercicios.Ipraticara2.heranca2;

public class Funcionario {
    private String nome;
    private double salario;

    @Override
    public String toString() {
        return
                "Nome: " + getNome() +
                " | Salario: " + getSalario() + " | ";
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public double calcularSalarioLiquido() {
        return salario * 0.9;
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
