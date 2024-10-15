package poo.exercicios.Ipraticara2.ControleDeEstoque;

public abstract class ProdutoBase implements Produto {
    private String nome;
    private double valor;

    public ProdutoBase(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void adicionarEstoque() {
        System.out.println("Adicionando ao estoque.");
    }

    @Override
    public void removerEstoque() {
        System.out.println("Removendo do estoque.");
    }

    public abstract double calcularPrecoVenda();

    public abstract void exibirDetalhes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
