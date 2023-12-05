package br.model;

public class Usuario {
    
    protected String nome;
    protected String numeroCel;
    protected String funcao;//se é gerente ou cliente
    
    

    public Usuario(){
        this.nome = "";
        this.numeroCel = "";
        this.funcao = "";
    }
    
    public Usuario(String nome, String numero){
        this.nome = nome;
        this.numeroCel = numero;
        this.funcao = "";
    }

    public String getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(String numeroCel) {
        this.numeroCel = numeroCel;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

   
}