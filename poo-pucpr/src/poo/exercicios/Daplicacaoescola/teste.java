package poo.exercicios.Daplicacaoescola;

public class teste {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        System.out.println(calcula(a));
        System.out.println(calcula(calcula(b)));
    }

    private static int calcula(int numero) {
        int resultado = 1;

        for (int i = 0; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
}

