package poo.exercicios.Ipraticara2.heranca2;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente() {
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioComBonus = getSalario() * bonus;

        return salarioComBonus;
    }


}
