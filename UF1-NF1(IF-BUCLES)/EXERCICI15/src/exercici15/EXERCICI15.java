/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class EXERCICI15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu el num1... ");
        num1 = sc.nextInt();
        System.out.println("Escriu el num2... ");
        num2 = sc.nextInt();
        System.out.println("Escriu el num3... ");
        num3 = sc.nextInt();
        
        if(num1>=num2 && num1>=num3)
        {
            System.out.println("num1 es el mas grande "+ num1);
        }
        else if(num2>=num3 && num2>=num1)
        {
            System.out.println("num2 es el mas grande " + num2);
        
        }
        else if(num3>=num1 && num3>=num2)
        {
            System.out.println("num1 es el mas grande " + num3);
        }  
    }
    
}
