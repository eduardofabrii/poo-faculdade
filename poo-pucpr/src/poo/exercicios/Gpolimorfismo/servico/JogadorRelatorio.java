package poo.exercicios.Gpolimorfismo.servico;

import poo.exercicios.Gpolimorfismo.dominio.Atacante;
import poo.exercicios.Gpolimorfismo.dominio.Defensor;
import poo.exercicios.Gpolimorfismo.dominio.Jogador;
import poo.exercicios.Gpolimorfismo.dominio.MeioCampo;

public class JogadorRelatorio {
    public static void gerarRelatorio(Jogador jogador) {
        System.out.println("Relatório do Jogador");
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Idade: " + jogador.getIdade());
        System.out.println("Time: " + jogador.getTime());

        if (jogador instanceof Atacante) {
            Atacante atacante = (Atacante) jogador;
            System.out.println("Gols: " + atacante.getGols());
            atacante.chutarProGol();
        }

        if (jogador instanceof Defensor) {
            Defensor defensor = (Defensor) jogador;
            System.out.println("Desarmes: " + defensor.getDesarmes());
            defensor.desarmar();
        }

        if (jogador instanceof MeioCampo) {
            MeioCampo meioCampo = (MeioCampo) jogador;
            System.out.println("Assistências: " + meioCampo.getAssistencias());
            meioCampo.darAssistencia();
        }
    }
}
