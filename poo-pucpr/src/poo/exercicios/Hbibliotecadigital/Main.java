package poo.exercicios.Hbibliotecadigital;

import poo.exercicios.Hbibliotecadigital.classes.Ebook;
import poo.exercicios.Hbibliotecadigital.classes.ItemBibliotecaDigital;
import poo.exercicios.Hbibliotecadigital.classes.VideoDigital;
import poo.exercicios.Hbibliotecadigital.interfaces.Visualizavel;

public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Pablo Marçal", "Perdendo KG's em uma semana.");
        Ebook ebook2 = new Ebook("Pablo Marçal", "Como tomar cadeirada em um debate?");
        Ebook ebook3 = new Ebook("Tabata Amaral", "Manual para ficar bonitona em 3 dias.");

        VideoDigital videoDigital1 = new VideoDigital("Juninho123", "Pablo Marçal tomando cadeirada");
        VideoDigital videoDigital2 = new VideoDigital("Paulinho Oloko", "Aula de Geografia | Planices");
        VideoDigital videoDigital3 = new VideoDigital("Apple Developer Academy", "Video de Inscrição");
        VideoDigital videoDigital4 = new VideoDigital("Eduardo Fabri", "Como eu entrei na Apple Developer Academy em 2024?");

        Visualizavel visualizavel;
        visualizavel = videoDigital1;

        ItemBibliotecaDigital item = ebook1;
        item.visualizar();
        item.baixar();
        System.out.println(item.descricao());

        System.out.println(" ");

        item = videoDigital1;
        item.visualizar();
        item.baixar();
        System.out.println(item.descricao());

    }
}
