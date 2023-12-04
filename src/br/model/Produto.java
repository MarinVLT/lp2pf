package br.model;

public class Produto { 
    private int id;
    private String nomeProduto;
    private String descricao;
    private double valor;
    
    Produto(int id, String nomeProduto, String descricao, double valor){
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}