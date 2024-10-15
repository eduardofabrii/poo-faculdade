package poo.exercicios.Ipraticara2.abstratoseinterfaces3;

public class VideoAula extends ProdutoDigital {
    public VideoAula(String nome) {
        super(nome);
    }

    @Override
    public void baixar() {
        System.out.println("Baixando VideoAula " + getNome());
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando VideoAula " + getNome());
    }
}
