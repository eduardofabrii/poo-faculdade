package poo.exercicios.Ztestes;

import java.util.Scanner;

public class Nascimentos {

    private int[][] dadosNascimento;

    public void perguntarData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas pessoas você vai inserir [EM NÚMEROS]: ");
        int numPessoas = sc.nextInt();
        dadosNascimento = new int[numPessoas][3];

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Digite o DIA de nascimento [EM NÚMEROS]: ");
            dadosNascimento[i][0] = sc.nextInt();
            System.out.print("Digite o MÊS de nascimento [EM NÚMEROS]: ");
            dadosNascimento[i][1] = sc.nextInt();
            System.out.print("Digite o ANO de nascimento [EM NÚMEROS]: ");
            dadosNascimento[i][2] = sc.nextInt();
        }
    }

    // Método para imprimir os dados de nascimento armazenados
    public void imprimirDadosNascimento() {
        if (dadosNascimento == null || dadosNascimento.length == 0) {
            System.out.println("Nenhum dado de nascimento disponível.");
            return;
        }

        for (int i = 0; i < dadosNascimento.length; i++) {
            System.out.println("Pessoa " + (i + 1) + ": " +
                    "Dia: " + dadosNascimento[i][0] + ", " +
                    "Mês: " + dadosNascimento[i][1] + ", " +
                    "Ano: " + dadosNascimento[i][2]);
        }
    }
}