package poo.exercicios.Ipraticara2.heranca1;

import java.util.ArrayList;
import java.util.Arrays;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro(2012, "Palio", "Fiat", 4));
        veiculos.add(new Moto(2020, "CB300", "Honda", 300));

        System.out.println(Arrays.toString(new ArrayList[]{veiculos}));
    }
}
