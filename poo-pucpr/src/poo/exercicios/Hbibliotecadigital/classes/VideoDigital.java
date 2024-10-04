package poo.exercicios.Hbibliotecadigital.classes;

import poo.exercicios.Hbibliotecadigital.interfaces.Baixavel;
import poo.exercicios.Hbibliotecadigital.interfaces.Visualizavel;

public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    public VideoDigital(String autor, String titulo) {
        super(autor, titulo);
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando " + this.getTitulo() + " de " + getAutor());
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
        System.out.println("Download do video concluído!");
    }

    @Override
    public String descricao() {
        return "Video Digital: '" + this.getTitulo() + "' & Autor: '" +  this.getAutor() + "'";
    }
}
