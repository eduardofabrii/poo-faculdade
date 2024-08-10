package poo.exercicios.Bprimeiraclasse;

public class TenisTeste01 {
    public static void main(String[] args) {
        Tenis tenis01 = new Tenis("Eduardo", "Preto", "Nike", 40, false, false);
        Tenis tenis02 = new Tenis("João", "Beje", "OUS", 40, true, true);
        Tenis tenis03 = new Tenis();

//        tenis01.setCor("Verde");
//        tenis01.imprimir();
//        tenis01.colocar();
//        tenis01.desamarrar();
        tenis01.imprimir();
        tenis01.amarrar();

        tenis02.imprimir();

        tenis02.pegarInfosPorScanner();
        tenis02.imprimir();

        tenis03.pegarInfosPorScanner();
        tenis03.imprimir();
    }
}
