package poo.exercicios.Ipraticara2.heranca3;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | Preco: " + getPreco() + " | ";
    }

    public double calcularDesconto(double porcento) {
        double novoPreco = 0;
        novoPreco = getPreco() - ((getPreco() * porcento) / 100);

        return novoPreco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
