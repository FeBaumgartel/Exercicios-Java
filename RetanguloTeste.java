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
public class RetanguloTeste {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        double comprimento, largura;
        comprimento = Double.parseDouble(args[0]);
        largura = Double.parseDouble(args[1]);

        if (comprimento <= 0 || largura <= 0) {
            System.out.println("Erro: Um dos lados do retângulo é igualou menor que zero");
        } else {
            System.out.println("Área: " + retangulo.area() + "\nPerímetro: " + retangulo.perimetrio());
        }

    }
}
