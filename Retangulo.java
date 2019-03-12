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
public class Retangulo {

    private double comprimento;
    private double largura;

    public double perimetrio() {
        return (largura * 2) + (comprimento * 2);
    }

    public double area() {
        return largura * comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

}
