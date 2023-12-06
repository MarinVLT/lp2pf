package br.model;

public class GerenteTest {
    public static void main(String[] args) throws Exception {
        Gerente g = new Gerente();

        Produto p1 = new Produto(1, "P1", "BLA", 2.2);
        Produto p2 = new Produto(2, "P2", "BLA", 3.4);
        Produto p3 = new Produto(3, "P3", "BLA", 10.4);     
        Produto p4 = new Produto(4, "P4", "BLA", 6.4);
        Produto p5 = new Produto(5, "P5", "BLA", 7.4);


        g.setNome("Adailton");
        g.setNumeroCel("8888888");


        g.cadastraProduto(p1);        
        g.cadastraProduto(p2);
        g.cadastraProduto(p3);
        g.cadastraProduto(p4);
        g.cadastraProduto(p5);

        System.out.println("LISTA DE PRODUTOS");
        System.out.println("----------------------------------");
        System.out.println("Quantidade de Produtos Ativos: " + g.getQntProd());
        System.out.println("----------------------------------");

        g.listaProdutosAtivos();

        System.out.println('\n');

        g.alterarValorProduto(1, 20);
        g.alterarValorProduto(3, 32.5);

        System.out.println("LISTA DE PRODUTOS ALTERANDO VALOR DE P1 E P3");
        System.out.println("----------------------------------");
        System.out.println("Quantidade de Produtos Ativos: " + g.getQntProd());
        System.out.println("----------------------------------");

        g.listaProdutosAtivos();

        System.out.println('\n');

        g.inativarProduto(2);

        System.out.println("LISTA DE PRODUTOS APOS INATIVAR P2");
        System.out.println("----------------------------------");
        System.out.println("Quantidade de Produtos Ativos: " + g.getQntProd());
        System.out.println("----------------------------------");

        g.listaProdutosAtivos();


    
    }

}
