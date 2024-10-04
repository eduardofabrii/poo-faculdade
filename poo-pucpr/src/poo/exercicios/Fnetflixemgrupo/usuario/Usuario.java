package poo.exercicios.Fnetflixemgrupo.usuario;


import poo.exercicios.Fnetflixemgrupo.pagamento.Pagamento;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;

    public Usuario(String nome, String email, String senha, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario | " +
                "Nome: " + nome + " | " +
                "Email: " + email + " | " +
                "Senha: " + senha + " | " +
                "Data Nascimento: " + dataNascimento ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
