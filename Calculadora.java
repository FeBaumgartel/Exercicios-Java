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
public class Calculadora {

    public static void main(String[] args) {
        double num1 = Integer.parseInt(args[0]);
        double num2 = Integer.parseInt(args[1]);

        System.out.println("Soma = " + (num1 + num2));
        System.out.println("\nProduto = " + (num1 * num2));
        System.out.println("\nDiferença = " + (num1 - num2));
        System.out.println("\nDivisão = " + (num1 / num2) + "\n");

        if (num1 > num2) {

            System.out.println(num1 + " é maior");
        } else if (num1 < num2) {

            System.out.println(num2 + " é maior");
        } else {
            System.out.println("Esses números são iguais");
        }
    }
}
