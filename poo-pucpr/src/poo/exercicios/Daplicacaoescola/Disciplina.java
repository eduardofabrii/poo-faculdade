package poo.exercicios.Daplicacaoescola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String codigo;
    private String sala;
    private String professor;

    public Disciplina(String nome, int cargaHoraria, String codigo, String sala, String professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.codigo = codigo;
        this.sala = sala;
        this.professor = professor;
    }

    public Disciplina(String nome) {
        this(nome, 0, "", "", "");
    }

    public Disciplina() {

    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSala() {
        return sala;
    }

    public String getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "" +
                "Disciplina: " + nome +
                " | Carga Horaria: " + cargaHoraria +
                " | Código: " + codigo +
                " | Sala: " + sala +
                " | Professor: " + professor + '\n';
    }

    public void listarDisciplinas(ArrayList<Disciplina> disciplinas) {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
        } else {
            for (int i = 0; i < disciplinas.size(); i++) {
                System.out.println("(" + (i + 1) + ") - " + disciplinas.get(i).getNome());
            }
        }
        System.out.println("Voltando...");
    }

    public static void staticcriarMatrizDisciplinas() {
        ArrayList<ArrayList<Disciplina>> matrizDisciplinas = new ArrayList<>();

        ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
        listaDisciplinas.add(new Disciplina("Programação Orientada a Objetos", 2, "203", "Bloco Azul", "Marina"));
        listaDisciplinas.add(new Disciplina("Estrutura de Dados", 4, "102", "Bloco Verde", "Carlos"));
        listaDisciplinas.add(new Disciplina("Banco de Dados", 3, "105", "Bloco Vermelho", "Fernanda"));
        listaDisciplinas.add(new Disciplina("Experiência Criativa", 2, "301", "Bloco Amarelo", "Renata"));
        listaDisciplinas.add(new Disciplina("Matemática Discreta", 3, "402", "Bloco Azul", "André"));

        matrizDisciplinas.add(listaDisciplinas);

    }

    public void verTodasDisciplinas() {
    }
}