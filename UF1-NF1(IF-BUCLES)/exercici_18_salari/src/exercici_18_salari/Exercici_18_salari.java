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
        double T_NORMAL, HORAS_NORMAL, h_extra, salario_extra, salario_normal, salario;
        int horas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado?");
        horas = sc.nextInt();
        
        T_NORMAL = 20;
        HORAS_NORMAL = 35;
        

        
        if (horas>HORAS_NORMAL)
        {
        h_extra = horas - HORAS_NORMAL;
        salario_extra = h_extra*T_NORMAL*1.5;
        salario_normal = HORAS_NORMAL * T_NORMAL;
        salario = salario_extra + salario_normal;
            
        }
        else
        {
            salario = horas * T_NORMAL;
            
            
        }
        System.out.println("Tu salario es " + salario);
        
    }
    
}
