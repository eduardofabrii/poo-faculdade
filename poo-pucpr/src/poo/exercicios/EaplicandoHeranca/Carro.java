package poo.exercicios.EaplicandoHeranca;

public class Carro extends Automovel {
    private int capacidadePortaMala;
    private TipoDeCarro tipoDoCarro;

    public Carro(String marca, String modelo, String motor, String placa, int capacidadePortaMala, TipoDeCarro tipoDeCarro) {
        super(marca, modelo, motor, placa);
        this.tipoDoCarro = tipoDeCarro;
        this.capacidadePortaMala = capacidadePortaMala;
    }

    public void abrirPorta() {
        System.out.println("Abrindo porta...");
    }

    public void fecharPorta() {
        System.out.println("Fechar porta...");
    }

    @Override
    public String toString() {
        return "Carro: " +
                "Capacidade Porta Mala: " + this.capacidadePortaMala + " " +
                "| Marca: " + this.getMarca() + " " +
                "| Modelo: " + this.getModelo() + " " +
                "| Motor: " + this.getMotor() + " " +
                "| Placa: " + this.getPlaca() + " " +
                "| Tipo do Carro: " + this.tipoDoCarro + " " +
                "| Rodas: " + this.getQuantidadeDeRodas() + " ";
    }

    public int getCapacidadePortaMala() {
        return capacidadePortaMala;
    }

    public void setCapacidadePortaMala(int capacidadePortaMala) {
        this.capacidadePortaMala = capacidadePortaMala;
    }
}

