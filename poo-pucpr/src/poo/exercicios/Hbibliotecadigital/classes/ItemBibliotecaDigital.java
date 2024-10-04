package poo.exercicios.Hbibliotecadigital.classes;

import poo.exercicios.Hbibliotecadigital.interfaces.Baixavel;
import poo.exercicios.Hbibliotecadigital.interfaces.Visualizavel;

public abstract class ItemBibliotecaDigital implements Visualizavel, Baixavel {
    private String titulo;
    private String autor;

    public ItemBibliotecaDigital(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    @Override
    public void visualizar() {
        System.out.println("Esse item não é visualizavel!");
    }

    public abstract String descricao();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
