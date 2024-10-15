package poo.exercicios.Ipraticara2.ControleDeEstoque;

import java.util.ArrayList;

public class Estoque {
    ArrayList<ProdutoBase> produtos = new ArrayList<>();

    public void adicionarProduto(ProdutoBase produto) {
        produtos.add(produto);
    }

    public void removerProduto(ProdutoBase produto) {
        produtos.remove(produto);
    }

    public void exibirDetalhes() {
        for (ProdutoBase p : produtos) {
            p.exibirDetalhes();
        }
    }
}
