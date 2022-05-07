/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.poo;

/**
 *
 * @author CEDUP16
 */
public class Produto {
   private String nome; 
    private int qntEstoque;
    double valor;
    
    public void alterarpreco( double novoPreco){
        this.valor = novoPreco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQntEstoque(){
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque){
        this.qntEstoque = qntEstoque;   
    }

    public double getValor(){
        return valor;       
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
}