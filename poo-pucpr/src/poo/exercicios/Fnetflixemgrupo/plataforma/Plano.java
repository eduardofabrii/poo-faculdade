package poo.exercicios.Fnetflixemgrupo.plataforma;

public class Plano {
    private String nomePlano; // premium, basico
    private double precoMensal;
    private boolean permiteDownload;

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public double getPrecoMensal() {
        return precoMensal;
    }

    public void setPrecoMensal(double precoMensal) {
        this.precoMensal = precoMensal;
    }

    public boolean isPermiteDownload() {
        return permiteDownload;
    }

    public void setPermiteDownload(boolean permiteDownload) {
        this.permiteDownload = permiteDownload;
    }
}
