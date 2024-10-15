package poo.exercicios.Ipraticara2.heranca3;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Eletronico("iPhone 16 Pro Max", 9000, 1));
        produtos.add(new Alimento("Tomate", 2, "2 dias"));
        produtos.add(new Vestuario("Camiseta Rip Curl", 129.00, 'M'));

        for (Produto p : produtos) {
            System.out.println(p);
        }

        Produto produtoComDesconto = produtos.get(0);
        double precoComDesconto = produtoComDesconto.calcularDesconto(2);

        System.out.println(produtos.get(0).getNome() + " - preço original R$" + produtoComDesconto.getPreco());
        System.out.println(produtos.get(0).getNome() + " - com desconto R$" + precoComDesconto);
    }
}
