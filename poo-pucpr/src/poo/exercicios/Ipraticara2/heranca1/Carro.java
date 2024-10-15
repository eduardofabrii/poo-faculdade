package poo.exercicios.Ipraticara2.heranca1;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(int ano, String modelo, String marca, int numPortas) {
        super(ano, modelo, marca);
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Numero de portas: " + numPortas + "\n";
    }
}
