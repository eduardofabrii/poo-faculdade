package poo.exercicios.Ipraticara2.abstratoseinterfaces3;

public abstract class ProdutoDigital {
    private String nome;

    public ProdutoDigital(String nome) {
        this.nome = nome;
    }

    public abstract void baixar();
    public abstract void visualizar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
