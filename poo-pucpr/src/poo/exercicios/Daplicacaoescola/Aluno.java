package poo.exercicios.Daplicacaoescola;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private String cpf;
    private String[][] dataDeNascimento;
    private int matricula;
    private Disciplina disciplina;

    public Aluno(String nome, String cpf, String[][] dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
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

    public String getDataDeNascimentoAsString() {
        StringBuilder sb = new StringBuilder();
        for (String[] data : dataDeNascimento) {
            sb.append(Arrays.toString(data)).append(" ");
        }
        return sb.toString().trim();
    }

    public void setDataDeNascimento(String[][] dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}