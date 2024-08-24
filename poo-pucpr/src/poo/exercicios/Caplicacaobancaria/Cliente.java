package poo.exercicios.Caplicacaobancaria;

public class Cliente {
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private int idade;
    private boolean contaAtiva;

    public String getNome() {
        return nome;
    }

    public void setNome(String login) {
        this.nome = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }
}
