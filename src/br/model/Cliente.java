package br.model;

//cliente add ao carrinho, remove do carrinho, finaliza compra

public class Cliente extends Usuario{
    
    private String StatusCompra = "EM ANDAMENTO";
    private String MetodoDePagamento;
    Carrinho carrinho = new Carrinho();
    

    

    public void addProdutoNoCarrinho(Produto p){
        carrinho.addProduto(p);
    }

    public void removerProdutoNoCarrinho(int id){
        carrinho.removerProduto(id);
    }

    public void finalizarCompra(String pagamento){
        StatusCompra = "FINALIZADA";
        MetodoDePagamento = pagamento;
    }

}
