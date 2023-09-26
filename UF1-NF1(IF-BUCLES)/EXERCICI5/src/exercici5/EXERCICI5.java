/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class EXERCICI5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, diametro, longitud;
        double pi= 3.14;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Pon el radio de circunferecia...");
        radio = sc.nextDouble();
        diametro = radio * 2;
        longitud = pi * diametro;
        
        System.out.println("la longitud de circunferencia de lado " + radio + "es " + longitud);
        
        area = pi * radio * radio;
        
        System.out.println("la area de circunferencia de radio " + radio);
    }
    
}
