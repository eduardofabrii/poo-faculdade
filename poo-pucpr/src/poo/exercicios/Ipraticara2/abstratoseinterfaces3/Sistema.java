package poo.exercicios.Ipraticara2.abstratoseinterfaces3;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<ProdutoDigital> produtos = new ArrayList<>();

        produtos.add(new Ebook("Como emagrecer rápido"));
        produtos.add(new VideoAula("Maratona Java"));
        produtos.add(new Software("Skype"));

        ProdutoDigital ebook1 = produtos.get(0);
        ProdutoDigital videoAula = produtos.get(1);
        ProdutoDigital software = produtos.get(2);

        ebook1.baixar();
        ebook1.visualizar();

        videoAula.baixar();
        videoAula.visualizar();

        software.baixar();
        software.visualizar();
    }
}
