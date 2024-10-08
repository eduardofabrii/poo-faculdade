package poo.exercicios.Gpolimorfismo.dominio;

public abstract class Jogador {
    private String nome;
    private int idade;
    private Time time;

    public Jogador(String nome, int idade, Time time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Jogador() {}

    @Override
    public String toString() {
        return this.nome;
    }

    public void mudarDeTime(Time novoTime) {
        this.time = novoTime;
    }

    public abstract void chutar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
