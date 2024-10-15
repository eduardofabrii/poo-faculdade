package poo.exercicios.Ipraticara2.heranca1;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(int ano, String modelo, String marca) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return
        "Marca: " + getMarca() + " | " +
                "Modelo: " + getModelo() + " | " +
                "Ano: " + getAno() + " | ";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
