package poo.exercicios.Ztestes;

import java.util.Scanner;

public class A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalCoposQuebrados = 0;

        for (int i = 0; i < n; i++) {
            int latas = sc.nextInt();
            int copos = sc.nextInt();


            if (latas > copos) {
                totalCoposQuebrados += copos;
            }
        }

        System.out.println(totalCoposQuebrados);
    }
}
