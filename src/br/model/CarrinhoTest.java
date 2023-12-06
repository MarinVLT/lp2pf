package br.model;

public class CarrinhoTest {

    public static void main(String[] args) throws Exception {
    
        Carrinho c =  new Carrinho();

        Produto p1 = new Produto(1, "P1", "BLA", 2.2);
        Produto p2 = new Produto(2, "P2", "BLA", 3.4);
        Produto p3 = new Produto(3, "P3", "BLA", 10.4);     
        Produto p4 = new Produto(4, "P4", "BLA", 6.4);
        Produto p5 = new Produto(5, "P5", "BLA", 7.4);
        Produto p6 = new Produto(5, "P5", "BLA", 7.4);

        c.buscarProduto(1);
        System.out.println("----------------------------------");

        c.addProduto(p1);
        c.addProduto(p2);
        c.addProduto(p3);
        c.addProduto(p4);
        c.addProduto(p5);
        c.addProduto(p6);
        

        System.out.println("Lista de produtos no carrinho");
        System.out.println("----------------------------------");

        c.listarProdutos();

        System.out.println('\n');

        c.buscarProduto(1);

        c.removerProduto(p1);
        c.removerProduto(p3);
        c.removerProduto(p3);
        c.removerProduto(p5);


        System.out.println("Lista de produtos no carrinho depois de remover P1, P3 E P5");
        System.out.println("----------------------------------");

        c.listarProdutos();

        c.esvaziarCarrinho();

        System.out.println('\n');


        System.out.println("Lista de produtos no carrinho depois de esvaziar o carrinho");
        System.out.println("----------------------------------");

        c.listarProdutos();
    
    }
    
}