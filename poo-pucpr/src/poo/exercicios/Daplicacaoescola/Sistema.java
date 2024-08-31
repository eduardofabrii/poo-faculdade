package poo.exercicios.Daplicacaoescola;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Professor professor = new Professor();
    private Disciplina disciplina = new Disciplina();
    // private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void menuInicial() {
        while (true) {
            System.out.println(
                    "(1) - Ver todas as disciplinas\n" +
                            "(2) - Matricular aluno\n" +
                            "(3) - Ver data/mês ou ano\n" +
                            "(4) - Ver banco de cadastros");

            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
//                    disciplina.listarDisciplinas();
                    break;
                case 2:
                    System.out.println("---- Matrícula de Aluno ----");

                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Data de nascimento [DD/MM/YYYY]: ");
                    String data = sc.nextLine();

                    String[] partesData = data.split("/");
                    if (partesData.length == 3) {
                        String[][] dataDeNascimento = new String[][]{partesData};
                        matricularAluno(nome, cpf, dataDeNascimento);
                    } else {
                        System.out.println("Formato de data inválido. Use DD/MM/YYYY.");
                    }
                    break;
                case 3:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }

                    System.out.print("Digite o índice do aluno: ");
                    int alunoIndice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Você deseja ver o DIA[0], MÊS[1] ou ANO[2]: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    if (alunoIndice >= 0 && alunoIndice < alunos.size()) {
                        Aluno aluno = alunos.get(alunoIndice);
                        String parteData = aluno.getDataDeNascimentoParte(0, indice);
                        System.out.println("Parte da data de nascimento: " + parteData);
                    } else {
                        System.out.println("Índice de aluno inválido.");
                    }
                    break;
                case 4:
                    bancoDeCadastros();
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }

    private int geradorNumeroDeMatricula(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public void matricularAluno(String nome, String cpf, String[][] dataDeNascimento) {
        Aluno novoAluno = new Aluno(nome, cpf, dataDeNascimento);

        int matricula = geradorNumeroDeMatricula(10000, 20000);
        novoAluno.setMatricula(matricula);

        alunos.add(novoAluno);

        System.out.println("Aluno matriculado com sucesso! Matrícula: " + matricula);
    }

    public void bancoDeCadastros() {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Aluno " + (i + 1) + "\n" +
                    "Nome: " + aluno.getNome() + "\n" +
                    "CPF: " + aluno.getCpf() + "\n" +
                    "Data de Nascimento: " + aluno.getDataDeNascimentoAsString() + "\n" +
                    "Matricula: " + aluno.getMatricula());
        }
    }
}