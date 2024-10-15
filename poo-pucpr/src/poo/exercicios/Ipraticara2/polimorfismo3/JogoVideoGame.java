package poo.exercicios.Ipraticara2.polimorfismo3;

public class JogoVideoGame extends Jogo {
    @Override
    public void iniciar() {
        System.out.println("Inicializando jogo de Video Game");
    }

    @Override
    public void encerrar() {
        System.out.println("Encerrando jogo de Video Game");
    }
}
