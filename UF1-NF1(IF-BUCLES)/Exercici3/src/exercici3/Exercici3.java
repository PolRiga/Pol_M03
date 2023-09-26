/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto mide el lado del cuadrado");
        lado = sc.nextDouble();
        area = lado * lado;
        
        System.out.println("El area de un cuadrado " + lado + "  es  " + area);
    }
    
}
