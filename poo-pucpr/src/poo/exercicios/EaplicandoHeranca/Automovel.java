package poo.exercicios.EaplicandoHeranca;

public class Automovel {
    private String marca;
    private String modelo;
    private String motor;
    private String placa;
    private char tipoCarteira;
    private int quantidadeDeRodas;

    public Automovel(String marca, String modelo, String motor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Caminhao: " +
                "| Marca: " + this.getMarca() + " " +
                "| Modelo: " + this.getModelo() + " " +
                "| Motor: " + this.getMotor() + " " +
                "| Placa: " + this.getPlaca() + " " +
                "| Rodas: " + this.getQuantidadeDeRodas() + " ";
    }

    public void buzinar() {
        System.out.println("Bi Bi");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }
}
