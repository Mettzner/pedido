
package exercícios;


public class mercado {


    public static void main(String[] args) {
        final Cliente clienteSilva = new Cliente();
        clienteSilva.getNome();
        clienteSilva.getIdade();
        clienteSilva.getCpf();
        clienteSilva.getDdd();
        clienteSilva.getTelefone();
        
        
        final Produto produtoArroz = new Produto();
        produtoArroz.getNome();
        produtoArroz.getQuantidadeEmEstoque();
        produtoArroz.getValorProduto();
         
        final pedido pedidoFinal = new pedido();
        pedidoFinal.getCodigo();
        pedidoFinal.getCliente();
        pedidoFinal.getProdutos() = new Produto[] {produtoSal};
    }
}