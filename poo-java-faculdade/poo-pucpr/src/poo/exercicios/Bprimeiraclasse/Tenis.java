package poo.exercicios.Bprimeiraclasse;

import java.util.Scanner;

public class Tenis {
    private String dono;
    private String cor;
    private String marca;
    private int tamanho;
    private boolean amarrado;
    private boolean estaNoPe;

    public Tenis(String dono, String cor, String marca, int tamanho, boolean amarrado, boolean estaNoPe) {
        this.dono = dono;
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
        this.amarrado = amarrado;
        this.estaNoPe = estaNoPe;
    }

    Tenis() {

    }

    public void pegarInfosPorScanner() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quem é o dono do tênis? ");
        this.dono = sc.nextLine();

        System.out.print("Qual é a cor do tênis? ");
        this.cor = sc.nextLine();

        System.out.print("Qual é a marca do tênis? ");
        this.marca = sc.nextLine();

        System.out.print("Qual é o tamanho tênis? ");
        this.tamanho = sc.nextInt();

        System.out.print("O tênis está amarrado? ");
        this.amarrado = sc.nextBoolean();

        System.out.print("O tênis está no pé? ");
        this.estaNoPe = sc.nextBoolean();
    }

    public void imprimir() {
        System.out.println("Dono: " + this.dono + " | Cor: " + this.cor + " | Marca: " + this.marca + " | Tamanho: " + this.tamanho + " | Amarrado: " + this.amarrado + " | Está no pé: " + this.estaNoPe);
    }

    public void colocar() {
        System.out.println("Colocando...");
        this.estaNoPe = true;
    }

    public void tirar() {
        System.out.println("Tirando...");
        this.estaNoPe = false;
    }

    public void amarrar() {
        if (this.amarrado == false) {
            System.out.println("Amarrando...");
            this.amarrado = true;
        } else {
            System.out.println("O tênis ja está amarrado.");
        }
    }

    public void desamarrar() {
        if (this.amarrado == true) {
            System.out.println("Desamarrando...");
            this.amarrado = false;
        } else {
            System.out.println("O tênis já está desamarrado.");
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isAmarrado() {
        return amarrado;
    }

    public void setAmarrado(boolean amarrado) {
        this.amarrado = amarrado;
    }

    public boolean isEstaNoPe() {
        return estaNoPe;
    }

    public void setEstaNoPe(boolean estaNoPe) {
        this.estaNoPe = estaNoPe;
    }
}
