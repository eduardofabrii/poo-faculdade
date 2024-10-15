package poo.exercicios.Ipraticara2.ControleDeEstoque;

public class ProdutoVestuario extends ProdutoBase {
    private final String CATEGORIA = "VESTUARIO";
    private char tamanho;

    public ProdutoVestuario(String nome, double valor, char tamanho) {
        super(nome, valor);
        this.tamanho = tamanho;
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
        return getValor() * 1.2;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto: " + getNome() + " | " +
                "Valor: R$" + getValor() + " | " +
                "Tamanho: " + getTamanho());
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
