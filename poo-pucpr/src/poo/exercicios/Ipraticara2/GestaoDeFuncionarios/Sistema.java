package poo.exercicios.Ipraticara2.GestaoDeFuncionarios;

import poo.exercicios.Ztestes.A;

public class Sistema {
    public static void main(String[] args) {
        Departamento departamento = new Departamento();

        departamento.funcionarios.add(new Gerente("Atair Fabri"));
        departamento.funcionarios.add(new Gerente("Rafael Souza"));
        departamento.funcionarios.add(new Analista("Julia Souza"));
        departamento.funcionarios.add(new Gerente("Tais Fabri"));

        Empregado emp1 = departamento.funcionarios.get(0);
        Empregado emp2 = departamento.funcionarios.get(1);
        Empregado emp3 = departamento.funcionarios.get(2);
        Empregado emp4 = departamento.funcionarios.get(3);

        emp3.calcularSalario();
        System.out.println(" ");

        System.out.println("Folha de pagamento: " + departamento.calcularFolhaPagamento());
    }
}
