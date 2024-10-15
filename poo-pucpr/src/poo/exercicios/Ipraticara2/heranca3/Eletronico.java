package poo.exercicios.Ipraticara2.heranca3;

public class Eletronico extends Produto {
    private int garantia;

    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return super.toString() + "Garantia: " + getGarantia();
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
