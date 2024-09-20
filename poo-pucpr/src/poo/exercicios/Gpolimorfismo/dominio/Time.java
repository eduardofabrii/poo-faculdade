package poo.exercicios.Gpolimorfismo.dominio;

public class Time {
    private String time;
    private String cidade;
    private String pais;
    private int fundacao;
    private int id;

    public Time(String time, String cidade, String pais, int fundacao, int id) {
        this.time = time;
        this.cidade = cidade;
        this.pais = pais;
        this.fundacao = fundacao;
        this.id = id;
    }

    public Time() {
    }

    @Override
    public String toString() {
        return this.time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFundacao() {
        return fundacao;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
