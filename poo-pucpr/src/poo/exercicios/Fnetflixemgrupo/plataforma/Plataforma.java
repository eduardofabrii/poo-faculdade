package poo.exercicios.Fnetflixemgrupo.plataforma;


import poo.exercicios.Fnetflixemgrupo.streaming.Filme;
import poo.exercicios.Fnetflixemgrupo.streaming.Serie;
import poo.exercicios.Fnetflixemgrupo.streaming.Streaming;
import poo.exercicios.Fnetflixemgrupo.usuario.Usuario;

import java.util.ArrayList;

public class Plataforma {
    // Plataforma == Utils
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Streaming> conteudos = new ArrayList<>();

    public Plataforma(ArrayList<Usuario> usuarios, ArrayList<Streaming> conteudos) {
        this.usuarios = usuarios;
        this.conteudos = conteudos;
    }

    public Plataforma() {
    }

    public void adicionarUsuario(String nome, String email, String senha, String dataNascimento) {
        Usuario usuario = new Usuario(nome, email, senha, dataNascimento);
        usuarios.add(usuario);
    }

    public void adicionarConteudo(Streaming conteudo) {
        conteudos.add(conteudo);
    }

    public void exibirUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario disponível.");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println((i + 1) + ". " + usuarios.get(i).toString());
            }
        }
    }

    public void editarUsuario(int opcao, String novoValor) {
        Usuario usuario = new Usuario(); // apagar pq ta errado

        switch (opcao) {
            case 1:
                usuario.setNome(novoValor);
                break;
            case 2:
                usuario.setEmail(novoValor);
                break;
            case 3:
                usuario.setSenha(novoValor);
                break;
            case 4:
                usuario.setDataNascimento(novoValor);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Usuario atualizado com sucesso!");
    }

    public void seriesPadroes() {
        Serie serie1 = new Serie("As Tranças de um Careca", "Comédia", 14, "2010", 1300, 280, 30);
        Serie serie2 = new Serie("Game of Thrones", "Fantasia", 8, "2011", 4500, 73, 60);
        Serie serie3 = new Serie("Breaking Bad", "Drama", 5, "2008", 2000, 62, 42);
        Serie serie4 = new Serie("Stranger Things", "Suspense", 4, "2016", 1600, 34, 45);
        Serie serie5 = new Serie("Friends", "Comédia", 10, "1994", 2360, 236, 25);

        conteudos.add(serie1);
        conteudos.add(serie2);
        conteudos.add(serie3);
        conteudos.add(serie4);
        conteudos.add(serie5);

    }

    public void exibirConteudos() {
        if (conteudos.isEmpty()) {
            System.out.println("Nenhum conteúdo disponível.");
        } else {
            for (int i = 0; i < conteudos.size(); i++) {
                System.out.println((i + 1) + ". " + conteudos.get(i).toString());
            }
        }
    }

    public void adicionarFilme(String titulo, String genero, int duracao, String diretor, int classificacaoEtaria) {
        Filme filme = new Filme();

        filme.setTitulo(titulo);
        filme.setGenero(genero);
        filme.setDuracao(duracao);
        filme.setDiretor(diretor);
        filme.setClassificacaoEtaria(classificacaoEtaria);

        conteudos.add(filme);
    }

    public void adicionarSerie(String titulo, String genero, int duracao, int temporadas, int episodios, int classificacaoEtaria) {
        Serie serie = new Serie();

        serie.setTitulo(titulo);
        serie.setGenero(genero);
        serie.setDuracao(duracao);
        serie.setTemporadas(temporadas);
        serie.setEpisodios(episodios);
        serie.setClassificacaoEtaria(classificacaoEtaria);

        conteudos.add(serie);
    }

    public void editarConteudo(int indice, int opcao, String novoValor) {
        int indiceCorreto = indice - 1;

        if (indiceCorreto >= 0 && indiceCorreto < conteudos.size()) {
            Streaming conteudo = conteudos.get(indiceCorreto);
            System.out.println("Conteúdo selecionado: " + conteudo.toString());

            switch (opcao) {
                case 1:
                    conteudo.setTitulo(novoValor);
                    System.out.println("Título atualizado para: " + novoValor);
                    break;
                case 2:
                    conteudo.setGenero(novoValor);
                    System.out.println("Gênero atualizado para: " + novoValor);
                    break;
                case 3:
                    conteudo.setDuracao(Integer.parseInt(novoValor));
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Conteúdo atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}