package poo.exercicios.Ipraticara2.polimorfismo3;

public class JogoCartas extends Jogo {
    @Override
    public void iniciar() {
        System.out.println("Inicializando jogo de cartas");
    }

    @Override
    public void encerrar() {
        System.out.println("Encerrando jogo de cartas");
    }
}
