package poo.exercicios.Ipraticara2.heranca3;

public class Vestuario extends Produto {
    private char tamanho;

    public Vestuario(String nome, double preco, char tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + "Tamanho: " + getTamanho();
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
