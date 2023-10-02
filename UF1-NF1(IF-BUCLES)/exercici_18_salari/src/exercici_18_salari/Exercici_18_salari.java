/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_18_salari;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class Exercici_18_salari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tarifa_normal, horas_normal, horas;
        double salario, salario_extra;
        
        tarifa_normal = 20;
        horas_normal = 35;
        salario = tarifa_normal * horas_normal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado?");
        horas = sc.nextInt();
        
    }
    
}
