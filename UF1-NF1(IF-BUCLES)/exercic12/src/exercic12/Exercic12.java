/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercic12;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class Exercic12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1, num2;
       Scanner sc = new Scanner (System.in);
        System.out.print("Escribe num1... ");
        num1 = sc.nextInt();
        System.out.println("Escribe num2... ");
        num2 = sc.nextInt();
        
        if(num1==num2)
        {
            System.out.println("Ambos son iguales");
        }
        else if(num1<num2)
        {
            System.out.println("num1 es menor que num2");
        }
        if(num1>num2)
        {
            System.out.println("num1 es mayor que num2");
        }
    }
    
}
