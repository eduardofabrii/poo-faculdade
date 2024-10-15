package poo.exercicios.Ipraticara2.abstratoseinterfaces3;

public class Ebook extends ProdutoDigital {
    public Ebook(String nome) {
        super(nome);
    }

    @Override
    public void baixar() {
        System.out.println("Baixando Ebook " + getNome());
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando Ebook " + getNome());
    }
}
