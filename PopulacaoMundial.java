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
public class PopulacaoMundial {

    public static void main(String[] args) {

        double taxa = 1.07;

        double pop = Double.parseDouble("7714576923");
        double anos =Double.parseDouble(args[0]);
        double total = (pop + (pop * taxa/100)) * anos;

        System.out.println(total+" pessoas");
        
        
        
        
    }
}
