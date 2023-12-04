package br.model;

import java.util.ArrayList;

//import br.model.Produto;

//import java.util.Scanner;

//Gerente cadastra produto, altera valor de produto, e retira produto

public class Gerente extends Usuario {

    private int qntProd = 0;
    //private Produto listaProduto[];
    ArrayList<Produto> listaProduto = new ArrayList<>();



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
    }

    public void listaProdutosAtivos(){
        for(Produto p : listaProduto){
            if(p.getStatus() == "ATIVO"){
                System.out.println("Nome do Produto: " + p.getNomeProduto());             
                System.out.println("Descrição do Produto: " + p.getDescricao());
                System.out.println("Valor do Produto: " + p.getValor());
            }
        }
    }


    //private String nome  = "ADM";
    //private int senha = 1234;
    //private Scanner ler = new Scanner(System.in);

    //private String loguin;
    //private int senhagerente;

    /*

    public int getSenha() {
        return senha;
    }
     
    public boolean validar(){
        System.out.println("Login:");
        login = ler.nextLine();

        System.out.println("Digite sua senha: ");
       
        senhagerente= Integer.parseInt(ler.nextLine());
        if ( (senha == senhagerente) && loguin.equals(nome)){
            System.out.println("validado");
            return true;

        }  
        else{
            System.out.println("eroo");
            return false;
        } 
    }
    
     */
           

}