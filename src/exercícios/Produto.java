package exercícios;

public class Produto {

    //Atributos
    private String nome;
    private double valorProduto;
    private int quantidadeEmEstoque;

    public Produto(String nome, int quantidadeEmEstoque, double valorProduto){
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.valorProduto = valorProduto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    
    
    
}
