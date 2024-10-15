package poo.exercicios.Ipraticara2.polimorfismo3;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<Jogo> jogos = new ArrayList<>();

        jogos.add(new JogoCartas());
        jogos.add(new JogoTabuleiro());
        jogos.add(new JogoVideoGame());

        Jogo jogo1 = jogos.get(0);
        Jogo jogo2 = jogos.get(1);
        Jogo jogo3 = jogos.get(2);

        jogo1.iniciar();
        jogo1.encerrar();
        System.out.println(" ");

        jogo2.iniciar();
        jogo2.encerrar();
        System.out.println(" ");

        jogo3.iniciar();
        jogo3.encerrar();
        System.out.println(" ");
    }
}
