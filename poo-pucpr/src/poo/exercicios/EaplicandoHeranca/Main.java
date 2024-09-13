package poo.exercicios.EaplicandoHeranca;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Palio", "AXV", "ASB6512", 100, TipoDeCarro.HATCH);
        Carro carro2 = new Carro("Chevrolet", "ONIX", "AGS", "ABS6172", 160, TipoDeCarro.SEDAN);
        Caminhao caminhao1 = new Caminhao("Volvo", "FMX", "HAHA", "RHB6B23", 500);

        caminhao1.setQuantidadeDeRodas(6);
        carro1.setQuantidadeDeRodas(4);
        carro2.setQuantidadeDeRodas(4);

        System.out.println(caminhao1.toString());
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
    }
}
