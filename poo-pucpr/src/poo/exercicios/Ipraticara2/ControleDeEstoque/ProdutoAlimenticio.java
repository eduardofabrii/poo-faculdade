package poo.exercicios.Ipraticara2.ControleDeEstoque;

public class ProdutoAlimenticio extends ProdutoBase {
    private final String CATEGORIA = "ALIMENTICIO";

    public ProdutoAlimenticio(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void adicionarEstoque() {
        super.adicionarEstoque();
    }

    @Override
    public void removerEstoque() {
        super.removerEstoque();
    }

    @Override
    public double calcularPrecoVenda() {
        return getValor() * 0.8;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto: " + getNome() + " | " +
                "Valor: R$" + getValor());
    }
}
