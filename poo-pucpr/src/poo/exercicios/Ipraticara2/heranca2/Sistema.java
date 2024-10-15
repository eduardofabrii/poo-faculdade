package poo.exercicios.Ipraticara2.heranca2;

import poo.exercicios.Ztestes.A;

import java.util.ArrayList;
import java.util.Arrays;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Rudney", 15000));
        funcionarios.add(new Gerente("Eduardo", 10000));

        funcionarios.add(new Analista("Pablo", 3000, 3));
        funcionarios.add(new Analista("Julia", 6000, 4));

        System.out.println(Arrays.toString(new ArrayList[]{funcionarios}));

        System.out.println(" ");

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Salário Liquido: " + f.calcularSalarioLiquido());
        }
    }
}
