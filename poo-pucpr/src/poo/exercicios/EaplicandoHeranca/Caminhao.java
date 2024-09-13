package poo.exercicios.EaplicandoHeranca;

public class Caminhao extends Automovel {
    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, String motor, String placa, double capacidadeDeCarga) {
        super(marca, modelo, motor, placa);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public void abrirPorta() {
        System.out.println("Abrindo porta...");
    }

    public void fecharPorta() {
        System.out.println("Fechar porta...");
    }

    public void colocarCarroceria() {
        System.out.println("Colocando carroceria...");
    }

    @Override
    public String toString() {
        return "Caminhao: " +
                "Capacidade de Carga: " + this.capacidadeDeCarga + " " +
                "| Marca: " + this.getMarca() + " " +
                "| Modelo: " + this. getModelo() + " " +
                "| Motor: " + this.getMotor() + " " +
                "| Placa: " + this.getPlaca() + " " +
                "| Rodas: " + this.getQuantidadeDeRodas() + " ";
    }
}
