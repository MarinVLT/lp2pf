package br.model;

public class ClienteTest {
    public static void main(String[] args) throws Exception {
        Cliente c = new Cliente();
        Carrinho car;

        Produto p1 = new Produto(1, "P1", "BLA", 2.2);
        Produto p2 = new Produto(2, "P2", "BLA", 3.4);
        Produto p3 = new Produto(3, "P3", "BLA", 10.4);     
        Produto p4 = new Produto(4, "P4", "BLA", 6.4);
        Produto p5 = new Produto(5, "P5", "BLA", 7.4);

        c.addProdutoNoCarrinho(p1);
        c.addProdutoNoCarrinho(p2);
        c.addProdutoNoCarrinho(p3);
        c.addProdutoNoCarrinho(p4);
        c.addProdutoNoCarrinho(p5);

        car = c.getCarrinho();

        System.out.println("Produtos no carrinho");
        System.out.println("----------------------------------");

        car.listarProdutos();

        System.out.println('\n');

        c.removerProdutoNoCarrinho(p5);
        c.removerProdutoNoCarrinho(p1);
        
        System.out.println("Produtos no carrinho");
        System.out.println("----------------------------------");

        car.listarProdutos();

        c.finalizarCompra("CARTÃO");

        System.out.println('\n');
        System.out.println("Produtos no carrinho após finalizar a compra");
        System.out.println("----------------------------------");
        car.listarProdutos();

    }
}
