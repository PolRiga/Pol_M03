/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class EXERCICI4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valor1, valor2;
       int suma, resta, multiplicacion;
       double division;
       Scanner sc = new Scanner(System.in);
        System.out.print("Pon valor 1...");
        valor1 = sc.nextInt();
        System.out.println("Pon valor 2...");
        valor2 = sc.nextInt();
        
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multiplicacion = valor1 * valor2;
        division = valor1 / valor2;
        
        if (valor2 != 0)
        {
          division = (double) valor1/valor2;
          System.out.println( valor1 + "/" + valor2 + "=" + division );      
        }
        else
        {
        System.out.println("No puedo dividir entre 0...");
        }
        
        System.out.println("La suma " + valor1 + "+" + valor2 + "=" + multiplicacion);
        System.out.println("La suma " + valor1 + "+" + valor2 + "=" + resta);
        System.out.println("La suma " + valor1 + "+" + valor2 + "=" + suma);
        System.out.println("La division " + valor1 + "/" + valor2 + "=" + division);
    }
    
}
