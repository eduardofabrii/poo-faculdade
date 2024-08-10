package poo.exercicios.Aprimeiroexerciciodopython;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {
    public static List<Integer> criarListaAleatoria(int tamanho) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>(tamanho);

        for (int i = 0; i < tamanho; i++) {
            int numero = random.nextInt(50);
            lista.add(numero);

            if (numero % 3 == 0) {
                System.out.println("Múltiplo de 3: " + numero);
            } else if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            } else {
                System.out.println("Número ímpar: " + numero);
            }
        }
        return lista;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da lista para gerar números aleatórios: ");
        int tamanhoLista = sc.nextInt();
        System.out.println("Lista completa: " + criarListaAleatoria(tamanhoLista));
    }
}
