package br.model;

import java.util.ArrayList;

//busca produto nele mesmo, recebe novos produtos, remove produtos dele mesmo

public class Carrinho {

    //private int qntProd = 0;
    //private int indexProd = 0;
    //private Produto carrinho[];

    ArrayList<Produto> carrinho = new ArrayList<>();


    public boolean buscarProduto(int id){
        for(Produto p : carrinho){
            if(p.getId() == id){
                return true;
            }
        }
    
        return false;
    }

    public void addProduto(Produto p){
        if(p.getStatus() == "ATIVO"){

            carrinho.add(p);

            /*
             if(buscarProduto(p.getId()) == false){
                carrinho.add(p);
            }else{          
                for(Produto item : carrinho){
                    if(p.getId() == item.getId()){
                        item.setQntProd(item.getQntProd()+1);
                    }
                }
            }
             */
            
        }
    }

    public void removerProduto(int id){
        if(buscarProduto(id) == true){
            for(Produto item : carrinho){
                if(item.getId() == id){
                    carrinho.remove(item);
                }
            }
        }
        else{
            System.out.println("Produto não encontrado no carrinho");
        }
    }

}
