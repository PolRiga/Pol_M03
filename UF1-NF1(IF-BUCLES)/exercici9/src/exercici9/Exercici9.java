/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class Exercici9 {

   
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Que edad tienes? ");
        edad = sc.nextInt();
    if(18<=edad)
    {
        System.out.println("Eres mayor de edad");
    }
    else
    {
        System.out.println("Eres menor de edad");
    
    }
    
    }
    
}
