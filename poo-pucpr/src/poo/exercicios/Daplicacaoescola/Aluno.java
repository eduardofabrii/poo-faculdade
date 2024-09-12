package poo.exercicios.Daplicacaoescola;

import java.util.ArrayList;
import java.util.Arrays;

public class Aluno {
    private String nome;
    private String cpf;
    private String[][] dataDeNascimento;
    private int matricula;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, String cpf, String[][] dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Data de Nascimento: " + this.getDataDeNascimentoAsString() + "\n" +
                "Matrícula: " + this.getMatricula();
    }

    public String getDataDeNascimentoAsString() {
        StringBuilder sb = new StringBuilder();
        for (String[] data : dataDeNascimento) {
            sb.append(Arrays.toString(data)).append(" ");
        }
        return sb.toString().trim();
    }

    public String getDataDeNascimentoParte(int index, int parte) {
        if (index >= 0 && index < dataDeNascimento.length) {
            switch (parte) {
                case 0: return dataDeNascimento[index][0];
                case 1: return dataDeNascimento[index][1];
                case 2: return dataDeNascimento[index][2];
                default: return "Parte inválida";
            }
        } else {
            return "Índice inválido";
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            System.out.println("Disciplina adicionada ao aluno " + nome);
        } else {
            System.out.println("Aluno já está matriculado na disciplina " + disciplina.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String[][] getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String[][] dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}