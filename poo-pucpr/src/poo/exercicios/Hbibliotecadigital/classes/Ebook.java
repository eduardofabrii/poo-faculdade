package poo.exercicios.Hbibliotecadigital.classes;

import poo.exercicios.Hbibliotecadigital.interfaces.Baixavel;

public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    public Ebook(String autor, String titulo) {
        super(autor, titulo);
    }

    @Override
    public String descricao() {
        return "Ebook: '" + this.getTitulo() + "' & Autor: '" +  this.getAutor() + "'";
    }

    @Override
    public void baixar() {
        System.out.println("Fazendo download... '" + this.getTitulo() + " de " + getAutor() + "'");
        for (int i = 0; i <= 100; i += 20) {
            System.out.println(i + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Download do Ebook concluído!");
    }
}
