package br.ulbra.model;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String sexo;

    public Usuario() {
    }
    public Usuario(int id, String nome, String email, String senha, String sexo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public String getSexo() {
        return sexo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", email=" + email + ", senha=" + senha + ", sexo=" + sexo + '}';
    }
    
    
    
}
