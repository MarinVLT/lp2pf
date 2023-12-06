package br.model;

//cliente add ao carrinho, remove do carrinho, finaliza compra

public class Cliente extends Usuario{
    
    private String StatusCompra = "EM ANDAMENTO";
    private Carrinho carrinho;


    public Cliente(){
        this.user = "";
        this.senha = "";
        this.nome = "";
        this.numeroCel = "";
        this.funcao = "CLIENTE";
        this.carrinho  = new Carrinho();
    }

    public Cliente(String user, String senha, String nome, String numero){
        this.user = user;
        this.senha = senha;
        this.nome = nome;
        this.numeroCel = numero;
        this.funcao = "CLIENTE";
        this.carrinho = new Carrinho();
    }

    public Cliente(String user, String senha, String nome, String numero, Carrinho lista){
        this.user = user;
        this.senha = senha;
        this.nome = nome;
        this.numeroCel = numero;
        this.funcao = "CLIENTE";
        this.carrinho = lista;
    }

    public void addProdutoNoCarrinho(Produto p){
        carrinho.addProduto(p);
    }

    public void removerProdutoNoCarrinho(Produto p){
        carrinho.removerProduto(p);
    }

    public void finalizarCompra(String pagamento){
        if(carrinho.getQntProd() > 0){
            StatusCompra = "FINALIZADA";

            carrinho.gerarNotaFiscal();
            System.out.println("\n----------------------------------");
            System.out.println("Metodo de pagamento: " + pagamento);
            carrinho.esvaziarCarrinho();
        }
            StatusCompra = "FINALIZADA";
            System.out.println("Carrinho vazio, não há produtos para realizar a compra.");
    }

    public String getStatusCompra() {
        return StatusCompra;
    }

    public void setStatusCompra(String statusCompra) {
        StatusCompra = statusCompra;
    }
    

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

}
