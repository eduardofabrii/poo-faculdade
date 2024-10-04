package poo.exercicios.Fnetflixemgrupo;

import poo.exercicios.Fnetflixemgrupo.plataforma.Plataforma;
import poo.exercicios.Fnetflixemgrupo.streaming.Serie;
import poo.exercicios.Fnetflixemgrupo.streaming.Streaming;
import poo.exercicios.Fnetflixemgrupo.usuario.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamingApp {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Streaming> conteudos;
    private Usuario usuario = new Usuario();
    Plataforma plataforma = new Plataforma();

    public void menuInicial() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println
                    ("(1) - Usuario\n" +
                            "(2) - Admin\n" +
                            "(3) - Sair");

            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    menuUsuario();
                    break;
                case 2:
                    menuAdmin();
                    break;
                case 3:
                    return;
            }
        }
    }

    public void menuUsuario() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println
                    ("## Menu Usuario ##\n" +
                            "(1) - Adicionar Usuario\n" +
                            "(2) - Ver Conteúdos Disponíveis\n" +
                            "(3) - Gerenciar Perfil\n" + // nao funciona
                            "(4) - Ver Status de Assinatura\n" + // nao funciona
                            "(5) - Sair\n");

            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Novo Usuário");

                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    System.out.print("Data de Nascimento: ");
                    String dataNascimento = sc.nextLine();

                    plataforma.adicionarUsuario(nome, email, senha, dataNascimento);
                    break;
                case 2:
                    plataforma.exibirConteudos();
                    break;
                case 3:
                    System.out.println("Editar Usuário");

                    System.out.print("O que você deseja mudar? (1: Nome, 2: Email, 3: Senha, 4: Data de Nascimento): ");
                    escolha = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o novo valor: ");
                    String novoValor = sc.nextLine();

                    plataforma.editarUsuario(escolha, novoValor);
                    break;
                case 4:
                    // falta status de assinatura
                    break;
                case 5:
                    return;
            }
        }
    }

    public void menuAdmin() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println
                    ("## Menu Admin ##\n" +
                            "(1) - Adicionar Conteúdo | Filme\n" +
                            "(2) - Adicionar Conteúdo | Série\n" +
                            "(3) - Editar Conteúdo | Filme ou Serie\n" +
                            "(4) - Exibir Usuários\n" +
                            "(5) - Exibir Conteúdos\n" +
                            "(6) - Sair");

            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Adicionar Filme)");

                    System.out.print("Titulo: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();

                    System.out.print("Genero: ");
                    String genero = sc.nextLine();

                    System.out.print("Duração: ");
                    int duracao = sc.nextInt();

                    System.out.print("Diretor: ");
                    sc.nextLine();
                    String diretor = sc.nextLine();

                    System.out.print("Classificação Etaria: ");
                    int classificacaoEtaria = sc.nextInt();

                    plataforma.adicionarFilme(titulo, genero, duracao, diretor, classificacaoEtaria);
                    System.out.println("Filme adicionado com sucesso!");

                    break;
                case 2:
                    System.out.println("Adicionar Série");

                    System.out.print("Titulo: ");
                    sc.nextLine();
                    titulo = sc.nextLine();

                    System.out.print("Genero: ");
                    genero = sc.nextLine();

                    System.out.print("Duração: ");
                    duracao = sc.nextInt();

                    System.out.print("Temporadas: ");
                    int temporadas = sc.nextInt();

                    System.out.print("Episodios: ");
                    int episodios = sc.nextInt();

                    System.out.print("Classificação Etaria: ");
                    classificacaoEtaria = sc.nextInt();

                    plataforma.adicionarSerie(titulo, genero, duracao, temporadas, episodios, classificacaoEtaria);
                    System.out.println("Série adicionado com sucesso!");

                    break;
                case 3:
                    System.out.println("Alterando Conteúdo");

                    System.out.println("Qual conteúdo você quer alterar: ");
                    plataforma.exibirConteudos();

                    System.out.print("Escolha o número do conteúdo que deseja mudar: ");
                    int opcao = sc.nextInt();

                    System.out.print("O que você deseja mudar? (1: Título, 2: Gênero, 3: Duração): ");
                    escolha = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o novo valor: ");
                    String novoValor = sc.nextLine();

                    plataforma.editarConteudo(opcao, escolha, novoValor);
                    break;
                case 4:
                    plataforma.exibirUsuarios();
                    break;
                case 5:
                    plataforma.exibirConteudos();
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        StreamingApp streaming = new StreamingApp();

        streaming.menuInicial();
    }
}