/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bhaskaracalc;

import java.util.Scanner;

/**
 *
 * @author Jhonata
 */
public class BhaskaraCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada_teclado = new Scanner(System.in);
        double a;
        double b;
        double c;
        double delta, x1, x2 = 0;
        System.out.println("insira o valor da letra a ");
        a = entrada_teclado.nextInt();
        System.out.println("insira o valor da letra b");
        b = entrada_teclado.nextInt();
        System.out.println("insira o valor da letra c");
        c = entrada_teclado.nextInt();
        delta = ((b * b) - 4 * a * c);
        System.out.println("o resultado do delta e de: " + delta);

        if (delta < 0) {
            
            System.out.println("delta é menor que 0");
            }
        else{
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("o resultado do x1 e de: " + x1);

            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("o resultado do x2 e de: " + x2);
        }
    }
    
}
