package poo.exercicios.Ipraticara2.abstratoseinterfaces3;

public class Software extends ProdutoDigital {
    public Software(String nome) {
        super(nome);
    }

    @Override
    public void baixar() {
        System.out.println("Baixando Software " + getNome());
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando Software " + getNome());
    }
}
