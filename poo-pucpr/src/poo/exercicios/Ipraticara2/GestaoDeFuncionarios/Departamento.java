package poo.exercicios.Ipraticara2.GestaoDeFuncionarios;

import java.util.ArrayList;

public class Departamento {
    ArrayList<Empregado> funcionarios = new ArrayList<>();

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Empregado e : funcionarios) {
            e.calcularSalario();
            total += e.getSalario();
        }

        return total;
    }
}
