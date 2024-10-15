package poo.exercicios.Ipraticara2.heranca3;

public class Alimento extends Produto {
    private String validade;

    public Alimento(String nome, double preco, String validade) {
        super(nome, preco);
        this.validade = validade;
    }

    @Override
    public String toString() {
        return super.toString() + "Validade: " + getValidade();
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
