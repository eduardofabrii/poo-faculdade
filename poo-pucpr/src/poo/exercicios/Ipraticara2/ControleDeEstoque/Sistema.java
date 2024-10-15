package poo.exercicios.Ipraticara2.ControleDeEstoque;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        ProdutoBase alface = new ProdutoAlimenticio("Alface", 12.90);
        ProdutoBase pizza = new ProdutoAlimenticio("Pizza", 48.98);
        ProdutoBase celular = new ProdutoEletronico("iPhone 11", 3339.99);
        ProdutoBase camiseta = new ProdutoVestuario("Camiseta Nike", 99.90, 'M');

        estoque.adicionarProduto(alface);
        estoque.adicionarProduto(pizza);
        estoque.adicionarProduto(celular);
        estoque.adicionarProduto(camiseta);

        estoque.removerProduto(pizza);

        estoque.exibirDetalhes();

        System.out.println("Preço de venda de \"" + celular.getNome() + "\" - R$" + celular.calcularPrecoVenda());
    }
}
