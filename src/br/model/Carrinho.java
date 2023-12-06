package br.model;

//import java.util.ArrayList;
import java.util.LinkedList;

//busca produto nele mesmo, recebe novos produtos, remove produtos dele mesmo

public class Carrinho {

    private int qntProd = 0;
    LinkedList<Produto> carrinho;


    public Carrinho(){
        carrinho = new LinkedList<>();
    }

    public Carrinho(LinkedList<Produto> lista){
        carrinho = lista;
    }

    public boolean buscarProduto(int id){
        if(qntProd > 0){
            for(Produto p : carrinho){
                if(p.getId() == id){
                    //System.out.println("Produto encontrado.");
                    return true;
                }
            }

            //System.out.println("Produto não encontrado.");
            return false;
        }else{
            System.out.println("Carrinho vazio.");
            return false;
        }
    }

    public void addProduto(Produto p){
        if(p.getStatus() == "ATIVO"){

            carrinho.add(p);
            qntProd++;
            
        }
    }

     public void removerProduto(Produto p){
        carrinho.remove(p);
     }

    public void listarProdutos(){
        if(qntProd > 0){
            for(Produto p : carrinho){
                System.out.println("Nome do Produto: " + p.getNomeProduto());             
                System.out.println("Descrição do Produto: " + p.getDescricao());
                System.out.printf("Valor do Produto = R$ %.2f\n", p.getValor());
                System.out.println("----------------------------------");
            }
        }else{
            System.out.println("Carrinho vazio.");
        }
        
    }

    public void esvaziarCarrinho(){
        carrinho = new LinkedList<>();
        qntProd = 0;
    }


    public double calcularTotalDaCompra(){
        double total = 0;
        
        if(qntProd > 0){
            for(Produto p : carrinho){
                total = total + p.getValor();
            }
        }

        return total;
    }

    public void gerarNotaFiscal(){

        System.out.println("NOTA FISCAL");
        System.out.println("----------------------------------");
        listarProdutos();
        System.out.printf("Total = R$ %.2f", calcularTotalDaCompra());

    }

    public LinkedList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(LinkedList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public int getQntProd() {
        return qntProd;
    }

    public void setQntProd(int qntProd) {
        this.qntProd = qntProd;
    }

}
