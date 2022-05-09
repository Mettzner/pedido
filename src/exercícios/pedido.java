/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios;

import java.util.Arrays;

/**
 *
 * @author CEDUP16
 */
public class pedido {

    private String codigo;
    private Produto[] produtos;
    private Cliente cliente;
    

    public void adicionarProduto(Produto novoProduto) {
        this.produtos = Arrays.copyOf(this.produtos, this.produtos.length + 1);
        this.produtos[this.produtos.length - 1] = novoProduto;

    }

    public double valorTotal() {
        double somaTotal = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            somaTotal = somaTotal + this.produtos[i].getValorProduto();
        }

        return somaTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
