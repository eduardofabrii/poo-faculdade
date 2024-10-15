package poo.exercicios.Ipraticara2.heranca2;

public class Analista extends Funcionario {
    private int nivel;

    public Analista(String nome, double salario, int nivel) {
        super(nome, salario);
        this.nivel = nivel;
    }

    public Analista() {
    }

    @Override
    public String toString() {
        return super.toString() + "Nivel: " + getNivel() + "\n";
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioComNivel = getSalario();

        if (nivel == 2) {
            salarioComNivel *= 1.5;
        } else if (nivel == 3) {
            salarioComNivel *= 1.8;
        } else if (nivel >= 4) {
            salarioComNivel *= 1.9;
        }

        return salarioComNivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
