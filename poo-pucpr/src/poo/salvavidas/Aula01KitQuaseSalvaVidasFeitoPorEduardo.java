package poo.salvavidas;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula01KitQuaseSalvaVidasFeitoPorEduardo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite o nome: ");
//        String nome = sc.nextLine();
//        System.out.println("O nome digitado foi: " + nome);
//
//        System.out.print("Digite a altura: ");
//        double altura = sc.nextFloat();
//        System.out.println("Altura de: " + altura + "m");
//
//        System.out.print("Digite a idade: ");
//        int idade = sc.nextInt();
//        System.out.println("O " + nome + " tem " + idade + " anos e " + altura + "cm");
//
//
//        System.out.print("Digite uma letra: ");
//        char letra = sc.next().charAt(0);
//        System.out.println("A letra digitada foi: " + letra);

//        Array Estatico
//        int numero = 5;
//        int[] vetorVazio = new int[numero];
//
//        for (int i = 0; i < vetorVazio.length; i++) {
//            System.out.println(vetorVazio[i]);
//        }

//        Vetor Preenchido
//        int[] vetorPreenchido = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < vetorPreenchido.length; i++) {
//            System.out.println(vetorPreenchido[i]);
//        }

//        Lista (list)
        ArrayList<Float> lista = new ArrayList<>();

        lista.add(1.2f);
        lista.add(2.3f);
        lista.add(3.8f);
        lista.add(41.2f);

        lista.set(2, 6.3f);

        lista.remove(1);

        System.out.println(lista.get(2));

//        Pega indice de determinado valor
        lista.indexOf(2);

//         Verifica se a lista está vazia
        System.out.println(lista.isEmpty());

        for (int i = 0; i < lista.toArray().length; i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Lista inteira: " + lista);
    }
}