package poo.exercicios.Ipraticara2.heranca1;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(int ano, String modelo, String marca, int cilindrada) {
        super(ano, modelo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cilindrada: " + cilindrada + "\n";
    }
}
