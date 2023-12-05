package br.model;

public class Login extends Usuario{
    private String user;
    private String senha;

    public Login(){
        this.user = "";
        this.senha = "";
    }
    
    public Login(String user, String senha){
        this.user = user;
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastraUser(){

    }
    
    public boolean logar(){
    
        return true;
    }

}