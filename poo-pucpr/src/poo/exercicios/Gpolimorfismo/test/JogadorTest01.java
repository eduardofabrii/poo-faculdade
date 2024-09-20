package poo.exercicios.Gpolimorfismo.test;

import poo.exercicios.Gpolimorfismo.dominio.*;
import poo.exercicios.Gpolimorfismo.servico.JogadorRelatorio;

import java.util.ArrayList;

public class JogadorTest01 {
    public static void main(String[] args) {
        ArrayList<Time> times = new ArrayList<>();
        ArrayList<Jogador> jogadores = new ArrayList<>();

        Time santos = new Time("Santos Futebol Clube", "Santos", "Brasil", 1912, 1);
        Time barcelona = new Time("Futbol Club Barcelona", "Madrid", "Espanha", 1899, 2);
        Time realMadrid = new Time("Real Madrid Club de Fútbol", "Madrid", "Espanha", 1902, 3);
        Time psg = new Time("Paris Saint-Germain Football Club", "Paris", "França", 1970, 4);

        times.add(santos);
        times.add(barcelona);
        times.add(realMadrid);
        times.add(psg);

        Jogador neymarJr = new Atacante("Neymar Jr", 32, santos, 768);
        Jogador lionelMessi = new Atacante("Messi", 36, barcelona, 650);
        Jogador toniKroos = new MeioCampo("Toni Kroos", 36, 123);
        Jogador marquinhos = new Defensor("Marquinhos", 34, psg, 2101);

        jogadores.add(neymarJr);
        jogadores.add(lionelMessi);
        jogadores.add(toniKroos);
        jogadores.add(marquinhos);

        JogadorRelatorio.gerarRelatorio(neymarJr);
        System.out.println(" ");
        JogadorRelatorio.gerarRelatorio(neymarJr);
        System.out.println(" ");
        JogadorRelatorio.gerarRelatorio(neymarJr);
        System.out.println(" ");
        JogadorRelatorio.gerarRelatorio(lionelMessi);
        System.out.println(" ");
        JogadorRelatorio.gerarRelatorio(marquinhos);
        System.out.println(" ");
        JogadorRelatorio.gerarRelatorio(marquinhos);
        System.out.println(" ");

        System.out.println(times);
        System.out.println(jogadores);
    }
}
