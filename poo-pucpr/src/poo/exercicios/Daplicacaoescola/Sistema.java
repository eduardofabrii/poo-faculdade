package poo.exercicios.Daplicacaoescola;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void menuInicial() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "(1) - Menu Aluno\n" +
                    "(2) - Menu Disciplina\n" +
                    "(0) - Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    menuAluno();
                    break;
                case 2:
                    menuDisciplina();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }

    public void menuAluno() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "(1) - Matricular Aluno\n" +
                    "(2) - Ver Data de Nascimento do Aluno\n" +
                    "(3) - Ver Banco de Cadastros\n" +
                    "(4) - Pesquisar Aluno\n" +
                    "(5) - Alterar Dados do Aluno\n" +
                    "(0) - Voltar");

            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Matrícula de Aluno");

                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Data de nascimento [DD/MM/YYYY]: ");
                    String data = sc.nextLine();
                    String[] partesData = data.split("/");

                    if (partesData.length == 3) {
                        String[][] dataDeNascimento = {partesData};
                        matricularAluno(nome, cpf, dataDeNascimento);
                    } else {
                        System.out.println("Formato de data inválido. Use DD/MM/YYYY.");
                    }
                    break;
                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }

                    System.out.print("Digite o nome do aluno: ");
                    sc.nextLine();
                    String nomeAluno = sc.nextLine();

                    Aluno alunoEncontrado = null;
                    for (Aluno aluno : alunos) {
                        if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                            alunoEncontrado = aluno;
                            break;
                        }
                    }

                    if (alunoEncontrado != null) {
                        System.out.print("Você deseja ver o dia[0], mês[1] ou ano[2]: ");
                        int indice = sc.nextInt();

                        String parteData = alunoEncontrado.getDataDeNascimentoParte(0, indice);
                        System.out.println("Parte da data de nascimento: " + parteData);
                    } else {
                        System.out.println("Aluno com nome " + nomeAluno + " não encontrado.");
                    }
                    break;
                case 3:
                    bancoDeCadastros();
                    break;
                case 4:
                    System.out.print("Digite o nome do aluno: ");
                    sc.nextLine();
                    String nomePesquisarAluno = sc.nextLine();

                    pesquisarAluno(nomePesquisarAluno);
                    break;
                case 5:
                    alterarDadosAluno();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }

    public void menuDisciplina() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "(1) - Ver Todas as Disciplinas\n" +
                    "(2) - Associar Aluno a uma Disciplina\n" +
                    "(3) - Pesquisar Disciplina\n" +
                    "(0) - Voltar");

            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    inicializarDisciplinas();
                    break;
                case 2:
                    inicializarDisciplinas();

                    System.out.println("Digite o índice do aluno para associar a uma disciplina:");
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println((i + 1) + ": " + alunos.get(i).getNome());
                    }

                    int indiceAluno = sc.nextInt() - 1;
                    sc.nextLine();

                    if (indiceAluno >= 0 && indiceAluno < alunos.size()) {
                        Aluno aluno = alunos.get(indiceAluno);

                        if (disciplinas.isEmpty()) {
                            System.out.println("Nenhuma disciplina cadastrada.");
                            break;
                        }

                        System.out.print("Digite o código da disciplina: ");
                        String codigoDisciplina = sc.nextLine();

                        Disciplina disciplina = null;
                        for (Disciplina d : disciplinas) {
                            if (d.getCodigo().equals(codigoDisciplina)) {
                                disciplina = d;
                                break;
                            }
                        }

                        if (disciplina != null) {
                            aluno.adicionarDisciplina(disciplina);
                            System.out.println("Aluno " + aluno.getNome() + " associado à disciplina " + disciplina.getNome() + " com sucesso!");
                        } else {
                            System.out.println("Disciplina com código " + codigoDisciplina + " não encontrada.");
                        }
                    } else {
                        System.out.println("Índice de aluno inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome da disciplina: ");
                    sc.nextLine();
                    String nomePesquisarDisciplina = sc.nextLine();

                    pesquisarDisciplina(nomePesquisarDisciplina);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }

    private int gerarNumeroDeMatricula(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public void matricularAluno(String nome, String cpf, String[][] dataDeNascimento) {
        Aluno novoAluno = new Aluno(nome, cpf, dataDeNascimento);
        int matricula = gerarNumeroDeMatricula(10000, 20000);
        novoAluno.setMatricula(matricula);
        alunos.add(novoAluno);
        System.out.println("Aluno matriculado com sucesso! Matrícula: " + matricula);
    }

    public void inicializarDisciplinas() {
        disciplinas.add(new Disciplina("Programacao Orientada a Objetos", 2, "203", "Bloco Azul", "Marina"));
        disciplinas.add(new Disciplina("Estrutura de Dados", 4, "102", "Bloco Verde", "Carlos"));
        disciplinas.add(new Disciplina("Banco de Dados", 3, "105", "Bloco Vermelho", "Fernanda"));
        disciplinas.add(new Disciplina("Experiencia Criativa", 2, "301", "Bloco Amarelo", "Renata"));
        disciplinas.add(new Disciplina("Matematica Discreta", 3, "402", "Bloco Azul", "André"));

        for (Disciplina disciplina : disciplinas) {
            System.out.println("Nome: " + disciplina.getNome());
            System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
            System.out.println("Código: " + disciplina.getCodigo());
            System.out.println("Bloco: " + disciplina.getSala());
            System.out.println("Professor: " + disciplina.getProfessor());
            System.out.println("-----------------------");
        }
    }

    public void pesquisarAluno(String nomeAluno) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                System.out.println("Aluno encontrado: ");
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Data de Nascimento: " + aluno.getDataDeNascimentoAsString());
                System.out.println("Matrícula: " + aluno.getMatricula());
                return;
            }
        }
        System.out.println("Aluno com nome " + nomeAluno + " não encontrado.");
    }

    public void pesquisarDisciplina(String nomeDisciplina) {
        inicializarDisciplinas();
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
                System.out.println("Disciplina encontrada: ");
                System.out.println("Nome: " + disciplina.getNome());
                System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
                System.out.println("Código: " + disciplina.getCodigo());
                System.out.println("Sala: " + disciplina.getSala());
                System.out.println("Professor: " + disciplina.getProfessor());
                return;
            }
        }
        System.out.println("Disciplina com nome " + nomeDisciplina + " não encontrada.");
    }


    public void bancoDeCadastros() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado");
        }

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println(aluno.toString());
        }
    }

    public Aluno buscarAlunoPorNome(String nomeAluno) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                return aluno;
            }
        }
        return null;
    }

    public void alterarNomeAluno(Aluno aluno, String novoNome) {
        aluno.setNome(novoNome);
    }

    public void alterarCpfAluno(Aluno aluno, String novoCpf) {
        aluno.setCpf(novoCpf);
    }

    public void alterarDataNascimentoAluno(Aluno aluno, String novaData) {
        String[] partesData = novaData.split("/");
        if (partesData.length == 3) {
            String[][] novaDataDeNascimento = {partesData};
            aluno.setDataDeNascimento(novaDataDeNascimento);
            System.out.println("Data de nascimento alterada com sucesso.");
        } else {
            System.out.println("Formato de data inválido. Use DD/MM/YYYY.");
        }
    }

    public void alterarDadosAluno() {
        Scanner sc = new Scanner(System.in);

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        System.out.print("Digite o nome do aluno que deseja alterar: ");
        String nomeAluno = sc.nextLine();

        Aluno alunoEncontrado = buscarAlunoPorNome(nomeAluno);

        if (alunoEncontrado == null) {
            System.out.println("Aluno com nome " + nomeAluno + " não encontrado.");
            return;
        }

        System.out.println("\nQual dado você deseja alterar?");
        System.out.println("(1) - Nome\n" +
                "(2) - CPF\n" +
                "(3) - Data de Nascimento\n" +
                "(0) - Cancelar");

        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                System.out.print("Digite o novo nome: ");
                String novoNome = sc.nextLine();
                alterarNomeAluno(alunoEncontrado, novoNome);
                System.out.println("Nome alterado com sucesso.");
                break;

            case 2:
                System.out.print("Digite o novo CPF: ");
                String novoCpf = sc.nextLine();
                alterarCpfAluno(alunoEncontrado, novoCpf);
                System.out.println("CPF alterado com sucesso.");
                break;

            case 3:
                System.out.print("Digite a nova data de nascimento [DD/MM/YYYY]: ");
                String novaData = sc.nextLine();
                alterarDataNascimentoAluno(alunoEncontrado, novaData);
                break;

            case 0:
                System.out.println("Operação cancelada.");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.menuInicial();
    }
}
