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
        double T_NORMAL, HORAS_NORMAL,impuestos, salario_impuestos, IMPUESTOS_25;
        double h_extra, salario_extra, salario_normal, salario, salario_tope;
        int horas;
        final int SALARIO_SIN_IMPUESTOS = 500;
        final int SALARIO_TOPE_IMPUESTOS = 900;
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
        System.out.println("Tu salario BRUTO es " + salario);
        
       if (salario>SALARIO_TOPE_IMPUESTOS)
       {
       salario_tope = salario - SALARIO_TOPE_IMPUESTOS;
       impuestos = salario_tope*0.45;
       salario_impuestos = SALARIO_TOPE_IMPUESTOS - SALARIO_SIN_IMPUESTOS;
       IMPUESTOS_25 = salario_impuestos * 0.25;
       impuestos = impuestos + IMPUESTOS_25;
       }
       
       else if(salario>SALARIO_SIN_IMPUESTOS && salario < SALARIO_TOPE_IMPUESTOS)
         {
                impuestos = salario*0.25;
                salario = salario - impuestos;
                System.out.println("Tu salario NETO es " + salario);
                System.out.println("Los impuestos son " + impuestos);
         }
        /*else
        {
            System.out.println("Tu salario es " + salario);
        }   
        */
        
    }
    
}
