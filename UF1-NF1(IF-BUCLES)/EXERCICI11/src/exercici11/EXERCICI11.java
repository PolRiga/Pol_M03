/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class EXERCICI11 {

   
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon num1...");
        System.out.println("Pon num2...");
        num2=sc.nextDouble();
        num1=sc.nextDouble();
        
        System.out.println(num1);
        System.out.println(num2);
        
        
        if(num1==num2)
        {
            System.out.println("Son iguales los valores");
        
        }
        else if(num1>num2)
        {
            System.out.println(num1 + " es mas grande que " + num2);
        }
        else
        {
            System.out.println(num2 + " es mas grande que " + num1);
        }
        
        
        
        
    }
    
}
