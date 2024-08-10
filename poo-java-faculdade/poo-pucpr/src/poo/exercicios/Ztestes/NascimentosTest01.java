package poo.exercicios.Ztestes;

public class NascimentosTest01 {
    public static void main(String[] args) {
        Nascimentos nascimento01 = new Nascimentos();

        System.out.print("Quantos numeros quer inserir? ");
        int[][] datas = new int[][]{};

        nascimento01.perguntarData();
        nascimento01.imprimirDadosNascimento();
    }
}
