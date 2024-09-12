package poo.exercicios.Daplicacaoescola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String codigo;
    private String sala;
    private String professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

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

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " matriculado na disciplina " + nome);
        } else {
            System.out.println("Aluno já está matriculado nesta disciplina.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}