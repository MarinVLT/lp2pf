package br.model;

//import java.util.ArrayList;
import java.util.LinkedList;

//import java.util.Scanner;

//Gerente cadastra produto, altera valor de produto, e retira produto

public class Gerente extends Usuario {

    private int qntProd = 0;
    //ArrayList<Produto> listaProduto;
    LinkedList<Produto> listaProduto;


    public Gerente(){
        this.nome = "";
        this.numeroCel = "";
        this.funcao = "GERENTE";
        listaProduto  = new LinkedList<>();
    }

    public Gerente(String nome, String numero){
        this.nome = nome;
        this.numeroCel = numero;
        this.funcao = "GERENTE";
        listaProduto = new LinkedList<>();
    }

    public Gerente(String nome, String numero, LinkedList<Produto> lista){
        this.nome = nome;
        this.numeroCel = numero;
        this.funcao = "GERENTE";
        listaProduto = lista;
    }


    public void cadastraProduto(Produto p){
        qntProd++;
        listaProduto.add(p);
    }

    public void alterarValorProduto(int id, double valor){
        for(Produto p : listaProduto){
            if(p.getId() == id){
                p.setValor(valor);
            }
        }
    }

    public void inativarProduto(int id){
        for(Produto p : listaProduto){
            if(p.getId() == id){
                p.setStatus("INATIVO");
            }
        }
        qntProd--;
    }

    public void listaProdutosAtivos(){
        if(qntProd > 0){
            for(Produto p : listaProduto){
                if(p.getStatus() == "ATIVO"){
                    System.out.println("Nome do Produto: " + p.getNomeProduto());             
                    System.out.println("Descrição do Produto: " + p.getDescricao());
                    System.out.println("Valor do Produto: " + p.getValor());
                    System.out.println("----------------------------------");
                }
            }
        }else{
            System.out.println("Cardapio vazio.");
        }
        
    }


    public LinkedList<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(LinkedList<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public int getQntProd() {
        return qntProd;
    }

    public void setQntProd(int qntProd) {
        this.qntProd = qntProd;
    }

        
}