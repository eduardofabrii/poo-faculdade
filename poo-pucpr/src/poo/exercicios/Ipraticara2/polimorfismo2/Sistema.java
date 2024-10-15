package poo.exercicios.Ipraticara2.polimorfismo2;

public class Sistema {
    public static void main(String[] args) {
        Alimento fruta = new Fruta();
        Alimento carne = new Carne();
        Alimento vegetal = new Vegetal();

        fruta.preparar();
        fruta.consumir();
        System.out.println(" ");

        carne.preparar();
        carne.consumir();
        System.out.println(" ");

        vegetal.preparar();
        vegetal.consumir();
        System.out.println(" ");
    }
}
