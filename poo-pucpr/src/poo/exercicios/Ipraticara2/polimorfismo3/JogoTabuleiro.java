package poo.exercicios.Ipraticara2.polimorfismo3;

public class JogoTabuleiro extends Jogo {
    @Override
    public void iniciar() {
        System.out.println("Inicializando jogo de tabuleiro");
    }

    @Override
    public void encerrar() {
        System.out.println("Encerrando jogo de tabuleiro");
    }
}
