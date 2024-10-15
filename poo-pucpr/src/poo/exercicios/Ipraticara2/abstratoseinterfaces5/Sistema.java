package poo.exercicios.Ipraticara2.abstratoseinterfaces5;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<DispositivoEletronico> dispositivos = new ArrayList<>();

        dispositivos.add(new Smartphone());
        dispositivos.add(new Computador());
        dispositivos.add(new Computador());
        dispositivos.add(new Televisao());

        DispositivoEletronico celular1 = dispositivos.get(0);
        DispositivoEletronico computador1 = dispositivos.get(1);
        DispositivoEletronico computador2 = dispositivos.get(2);
        DispositivoEletronico televisao1 = dispositivos.get(3);

        celular1.ligar();
        computador1.ligar();
        computador2.ligar();
        computador1.desligar();
        computador2.desligar();
    }
}
