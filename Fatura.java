/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author felip
 */
public class Fatura {
    private String codigo;
    private String descricao;
    private int qtd;
    private double preco;
    
    public double totalFaturado(){
        return qtd*preco;
    }

    public Fatura(String codigo, String descricao, int qtd, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
